package 정수_삼각형;



import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int size = Integer.valueOf(br.readLine());
			
			int[][] triangle = new int[size][size];
			int[][] matrix = new int[size][size];
			
			String[] str;
			for(int i = 0; i < size; i++) {
				str = br.readLine().split(" ");
				for(int j = 0; j < i + 1; j++) {
					triangle[i][j] = Integer.valueOf(str[j]);
				}
			}
			

			
			matrix[0][0] = triangle[0][0];
			for(int i = 1; i < size; i++) {
				matrix[i][0] = matrix[i - 1][0] + triangle[i][0];
				matrix[i][i] = matrix[i - 1][i - 1] + triangle[i][i];
			}
			
//			for(int i = 0; i < size; i++) {
//				System.out.println(Arrays.toString(matrix[i]));
//			}
			
			for(int i = 2; i < size; i++) {
				for(int j = 1; j < i; j++) {
					if(matrix[i - 1][j - 1] > matrix[i - 1][j]) {
						matrix[i][j] = matrix[i - 1][j - 1] + triangle[i][j];
					}else {
						matrix[i][j] = matrix[i - 1][j] + triangle[i][j];
					}
				}
			}
			int max = 0;
			for(int i = 0; i < size; i++) {
				if(matrix[size - 1][i] > max) {
					max = matrix[size - 1][i];
				}
			}
			System.out.println(max);
		}catch(IOException e) {
			
		}

	}

}