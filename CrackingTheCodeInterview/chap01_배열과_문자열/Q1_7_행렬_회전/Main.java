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
			printMatrix();
			System.out.println(i);
			
			//a-b저장
			for(int j = i; j < n - i; j++) {
				ary[j] = matrix[i][j];
			}
			
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
