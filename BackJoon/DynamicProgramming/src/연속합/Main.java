package 연속합;


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
			
			int max = Integer.MIN_VALUE;
			int sum = 0;
			for(int i = 0; i < n; i++) {
//				System.out.println("i: " + i + ", sum: " + sum + ", max: " + max);
				sum = sum + ary[i];
				
				if(sum > max) {
					max = sum;
				}	
				
				if(sum < 0) {
					sum = 0;
				}
			}
			System.out.println(max);
		}catch(IOException e) {
			
			
		}

	}

}