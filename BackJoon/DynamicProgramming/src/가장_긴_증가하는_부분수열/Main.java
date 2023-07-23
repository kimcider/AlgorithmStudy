package 가장_긴_증가하는_부분수열;

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
			
			int[][][] matrix = new int[n][n][2];
			for(int i = 0; i < n; i++) {
				matrix[i][i][0] = 1;
				matrix[i][i][1] = ary[i];
			}
			/*
			 * n * n 매트릭스
			 * matrix[i][j][0]은 ary[i]부터 ary[j]까지의 가장 긴 증가부분수열의 길이
			 * matrix[i][j][1]은 ary[i]부터 ary[j]까지의 가장 큰 값.
			 */
			int max = 1;
			
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					if(ary[j] > matrix[i][j - 1][1]) {
						matrix[i][j][0] = matrix[i][j - 1][0] + 1;
						matrix[i][j][1] = ary[j];
						if(matrix[i][j][0] > max) {
							max = matrix[i][j][0];
						}
					}else {
						matrix[i][j][0] = matrix[i][j - 1][0];
						matrix[i][j][1] = matrix[i][j - 1][1];
					}
				}
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(matrix[i][j][0]+ " ");
				}
				System.out.println();
			}
			
			System.out.println(max);
		}catch(IOException e) {
			
		}

	}

}

