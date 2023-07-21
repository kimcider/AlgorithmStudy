package _1_2_3_더하기;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			int[] list = new int[12];
			
			list[0] = 0;
			list[1] = 1;
			list[2] = 2;
			list[3] = 4;
			
			for(int i = 4; i < 12; i++) {
				int sum = 0;
				sum = sum + list[i - 1];
				sum = sum + list[i - 2];
				sum = sum + list[i - 3];
				list[i] = sum;
			}
			
			for(int i = 0; i < n; i++) {
				System.out.println(list[Integer.valueOf(br.readLine())]);
			}
			
		}catch(IOException e) {
			
		}

	}

}

