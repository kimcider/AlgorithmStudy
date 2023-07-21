package 계단_오르기;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			int[] ary = new int[n];
			for(int i = 0; i < n; i++) {
				ary[i] = Integer.valueOf(br.readLine());
			}
			
			System.out.println(Arrays.toString(ary));
		}catch(IOException e) {
			
		}

	}

}

