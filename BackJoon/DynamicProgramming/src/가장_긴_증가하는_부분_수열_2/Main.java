package 가장_긴_증가하는_부분_수열_2;


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
			
			TreeSet<Integer> set = new TreeSet<>();
			set.add(ary[0]);
			
			for(int i = 1; i < n; i++) {
				if(ary[i] > set.last()) {
					set.add(ary[i]);
				}else {
					if(set.contains(ary[i])) {
						continue;
					}else {
						set.remove(set.higher(ary[i]));
						set.add(ary[i]);
					}
				}
			}
			int size = set.size();
//			for(int i = 0; i < size; i++) {
//				System.out.println(set.pollFirst());
//			}
			System.out.println(size);
		}catch(IOException e) {
			
		}

	}

}