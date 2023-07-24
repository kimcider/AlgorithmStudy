package 가장_긴_감소하는_부분_수열;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			int[] ary = new int[n];
			String[] str = br.readLine().split(" ");
			
			for(int i = 0; i < n; i++) {
				ary[i] = Integer.valueOf(str[i]);
			}
			
			int[] LDS = new int[n];
			for(int i = 0; i < n; i++) {
				LDS[i] = 1;
			}
			
			for(int i = 1; i < n;i++) {
				for(int j = 0; j < i; j++) {
					if(ary[i] < ary[j]) {
						if(LDS[i] < LDS[j] + 1) {
							LDS[i] = LDS[j] + 1;
						}
					}
				}
			}
			
			int max = 0;
			for(int i = 0; i < n; i++) {
				if(LDS[i] > max) {
					max = LDS[i];
				}
			}
			System.out.println(max);
		}catch(IOException e) {
			
		}

	}

}