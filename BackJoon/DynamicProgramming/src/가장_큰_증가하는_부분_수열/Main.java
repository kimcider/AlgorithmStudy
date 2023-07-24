package 가장_큰_증가하는_부분_수열;

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
			for(int i = 0; i < n; i++) {
				LIS[i] = ary[i];
			}
			
//			System.out.println(Arrays.toString(LIS));
			for(int i = 1; i < n; i++) {
				for(int j = 0; j < i; j++) {
					if(ary[i] > ary[j]) {
						if(LIS[i] < LIS[j] + ary[i]) {
							LIS[i] = LIS[j] + ary[i];
						}
					}
				}
			}
//			System.out.println(Arrays.toString(LIS));
			int max = 0;
			for(int i = 0; i < n; i++) {
				if(LIS[i] > max) {
					max = LIS[i];
				}
			}
			System.out.println(max);
		}catch(IOException e) {
			
		}
	}
}