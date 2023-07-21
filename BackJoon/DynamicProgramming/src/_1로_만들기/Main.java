package _1로_만들기;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			
			int[] counter = new int[n + 1];
			counter[n] = 0;
			for(int i = n - 1; i >= 1; i--) {
				int min = counter[i + 1];

				if(i * 2 <= n) {
					if(counter[i * 2] < min) {
						min = counter[i * 2];
					}
				}
				if(i * 3 <= n) {
					if(counter[i * 3] < min) {
						min = counter[i * 3];
					}
				}
				
				counter[i] = min + 1;
			}
			
//			System.out.println(Arrays.toString(counter));
			System.out.println(counter[1]);
			
		}catch(IOException e) {
			
		}

	}

}

