package 보석_도둑;

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] str = br.readLine().split(" ");
			int N = Integer.valueOf(str[0]);
			int K = Integer.valueOf(str[1]);
			
			int[][] jewel = new int[N][2];
			TreeMap<Integer, Integer> backpack = new TreeMap<>();
			for(int i = 0; i < N; i++) {
				str = br.readLine().split(" ");
				jewel[i][0] = Integer.valueOf(str[0]);
				jewel[i][1] = Integer.valueOf(str[1]);
			}
			Arrays.sort(jewel, new MyCom());

			for(int i = 0; i < K; i++) {
				int weight = Integer.valueOf(br.readLine());
				if(backpack.containsKey(weight)) {
					backpack.put(weight, backpack.get(weight) + 1);
				}else {
					backpack.put(weight, 1);
				}
			}
			
//			System.out.println(backpack.toString());
			
			long answer = 0;
			for(int i = 0; i < N; i++) {
//				System.out.println(Arrays.toString(jewel[i]));
				int target = jewel[i][0];
				int price = jewel[i][1];
				if(backpack.containsKey(target)) {
					answer = answer + price;
					backpack.put(target, backpack.get(target) - 1);
					if(backpack.get(target) == 0) {
						backpack.remove(target);
					}
				}else {
					int weight = 0;
					try {
						weight = backpack.higherKey(target);
//						System.out.println(weight);
					}catch(NullPointerException e) {
						continue;
					}
					answer = answer + price;
					backpack.put(weight, backpack.get(weight) - 1);
					
					if(backpack.get(weight) == 0) {
						backpack.remove(weight);
					}
				}
			}
			System.out.println(answer);
			
		}catch(IOException e){
		}
	}
	static class MyCom implements Comparator<int[]> {
		public int compare(int[]a, int[]b) {
			return b[1] - a[1];
		}
	}
}
