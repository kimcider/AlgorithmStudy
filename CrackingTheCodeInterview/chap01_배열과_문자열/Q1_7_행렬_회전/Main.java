package Q1_7_행렬_회전;

import java.util.Arrays;

public class Main {
	static int matrix[][];
	static int n;
	public static void main(String[] args) {
		n = 5;
		matrix = new int[n][n];
		
		int cnt = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = cnt++; 
			}
		}
		
		rotate();
		printMatrix();
		
	}

	static void rotate() {
		int[] ary = new int[n];
		for(int i = 0; i < n/2; i++) {			
			//a-b저장
			for(int j = i + 1; j < n - i ; j++) {
				ary[j] = matrix[i][j];
			}
			
			//ca -> ab
			for(int j = i; j < n - i - 1; j++)
				matrix[i][n - j - 1] = matrix[j][i];
			
			//cd -> ac
			for(int j = i; j < n - i - 1; j++)
				matrix[j][i] = matrix[n - i - 1][j];
				
			//bd -> cd
			for(int j = i; j < n - i - 1; j++)
				matrix[n - i - 1][j] = matrix[n - j - 1][n - i - 1];

			//ary -> bd
			for(int j = i + 1; j < n - i; j++)
				matrix[j][n - i - 1] = ary[j];
				
		}
	}
	
	static void printMatrix() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
