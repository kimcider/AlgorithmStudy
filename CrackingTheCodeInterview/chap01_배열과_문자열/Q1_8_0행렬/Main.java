package Q1_8_0행렬;

import java.util.Arrays;

public class Main {
	static int[][] matrix;
	static int n, m;
	static void init_matrix() {
		n = 5;
		m = 8;
		matrix = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matrix[i][j] = 5;
			}
		}
		
		matrix[3][3] = 0;
		matrix[1][6] = 0;
	}
	
	static void printMatrix() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		init_matrix();
		printMatrix();
//		solution();
		book_answer();
		printMatrix();
	}

	static void solution() {
		int[] row = new int[n];
		int[] col = new int[m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j< m; j++) {
				if(matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
	
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(row[i] == 1) {
					matrix[i][j] = 0; 
				}
				if(col[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	
	static void book_answer() {
		boolean rowHaveZero = false;
		boolean colHaveZero = false;
		for(int i = 0; i < m; i++) {
			if(matrix[0][i] == 0) rowHaveZero = true;
		}
		for(int i = 0; i < n; i++) {
			if(matrix[i][0] == 0) colHaveZero = true;
		}
		
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < m; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(matrix[i][0] == 0) {
				for(int j = 0; j < m; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		for(int i = 0; i < m; i++) {
			if(matrix[0][i] == 0) {
				for(int j = 0; j < n; j++) {
					matrix[j][i] = 0;
				}
			}
		}
		
		if(rowHaveZero == true) {
			for(int i = 0; i < m; i++) {
				matrix[0][i] = 0;
			}
		}
		if(colHaveZero == true) {
			for(int i = 0; i < n; i++) {
				matrix[i][0] = 0;
			}
		}
		
	}
}
