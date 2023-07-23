package 파도반_수열;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			
			int[] list = new int[n];
			int max = 0;
			for(int i = 0; i < n; i++) {
				list[i] = Integer.valueOf(br.readLine());
				if(list[i] > max) {
					max = list[i];
				}
			}
			
			if(max < 10) {
				max = 10;
			}
			long[] triangle = new long[max];
			triangle[0] = 1;
			triangle[1] = 1;
			triangle[2] = 1;
			triangle[3] = 2;
			triangle[4] = 2;
			triangle[5] = 3;
			triangle[6] = 4;
			triangle[7] = 5;
			triangle[8] = 7;
			triangle[9] = 9;
			
			for(int i = 10; i < max; i++) {
				triangle[i] = triangle[i - 1] + triangle[i - 5];
			}
			
			for(int i = 0; i < n; i++) {
				System.out.println(triangle[list[i] - 1]);
			}
			
		}catch(IOException e) {
			
		}

	}

}