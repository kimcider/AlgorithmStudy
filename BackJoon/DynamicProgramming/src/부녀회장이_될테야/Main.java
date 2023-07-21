package 부녀회장이_될테야;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Integer N = Integer.valueOf(br.readLine());
			
			int[][] number = new int[15][15];
			for(int i = 1; i < 15; i++) {
				number[i][1] = 1;
				number[0][i] = i;
			}
			
			for(int i = 1; i < 15; i++) {
				for(int j = 2; j < 15; j++) {
					number[i][j] = number[i][j - 1] + number[i - 1][j];
				}
			}
			
			
			for(int i = 0; i < N; i++) {
				int k = Integer.valueOf(br.readLine());
				int n = Integer.valueOf(br.readLine());
				
				System.out.println(number[k][n]);
			}
			
		}catch(IOException e) {
			
		}

	}

}

