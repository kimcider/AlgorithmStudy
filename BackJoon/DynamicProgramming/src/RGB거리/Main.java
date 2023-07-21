package RGB거리;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			int[][] array = new int[n][3];
			
			String[] str;
			for(int i = 0; i < n; i++) {
				str = br.readLine().split(" ");
				array[i][0] = Integer.valueOf(str[0]);
				array[i][1] = Integer.valueOf(str[1]);
				array[i][2] = Integer.valueOf(str[2]);
			}
			
			int[][] answer = new int[n][3];
			answer[0][0] = array[0][0];
			answer[0][1] = array[0][1];
			answer[0][2] = array[0][2];
			
			for(int i = 1; i < n; i++) {
				for(int j = 0; j < 3; j++) {
					int num1 = (j + 1) % 3;
					int num2 = (j + 2) % 3;
					
					
					
					int val1 = answer[i - 1][num1];
					int val2 = answer[i - 1][num2];
					
					if(val1 < val2) {
						answer[i][j] = array[i][j] + val1;
					}else {
						answer[i][j] = array[i][j] + val2;
					}
				}
			}
			
//			for(int i = 0; i < n ; i++) {
//				System.out.println(Arrays.toString(answer[i]));
//			}
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < 3; i++) {
				if(answer[n - 1][i] < min) {
					min = answer[n - 1][i];
				}
			}
			System.out.println(min);
		}catch(IOException e) {
			
		}

	}

}

