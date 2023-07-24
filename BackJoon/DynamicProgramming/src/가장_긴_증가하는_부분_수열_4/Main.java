package 가장_긴_증가하는_부분_수열_4;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			String[] str = br.readLine().split(" "); 
			int[] ary = new int[n];
			for(int i = 0; i < n; i++) {
				ary[i] = Integer.valueOf(str[i]);
			}
			
			int[] LIS = new int[n];
			int[] before = new int[n];
			
			for(int i = 0; i < n; i++) {
				LIS[i] = 1;
				before[i] = -1;
			}
			
			int max = 0;
			int maxIndex = 0;
			for(int i = 1; i < n; i++) {
				for(int j = 0; j < i; j++) {
					if(ary[i] > ary[j]) {
						if(LIS[i] < LIS[j] + 1) {
							LIS[i] = LIS[j] + 1;
							before[i] = j;
							
							if(LIS[i] > max) {
								max = LIS[i];
								maxIndex = i;
							}
						}
					}
				}
			}
//			System.out.println(Arrays.toString(LIS));
//			System.out.println(Arrays.toString(before));
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			int index = maxIndex;
			while(index >= 0) {
//				System.out.println(index);
				pq.add(ary[index]);
				index = before[index];
			}
			
			int size = pq.size(); 
			System.out.println(size);
			for(int i = 0; i < size; i++) {
				System.out.print(pq.poll()+" ");
			}
		}catch(IOException e) {
			
		}

	}

}