package 피보나치_함수;


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
			try {
				int[][] answer = new int[max + 1][2];
				answer[0][0] = 1;
				answer[0][1] = 0;
				answer[1][0] = 0;
				answer[1][1] = 1;
				for(int i = 2; i <= max; i++) {
					answer[i][0] = answer[i - 1][0] + answer[i - 2][0];
					answer[i][1] = answer[i - 1][1] + answer[i - 2][1];
				}
				
				for(int i = 0; i < n; i++) {
					System.out.println(answer[list[i]][0] + " " + answer[list[i]][1]);
				}	
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("1 0");
			}
			
		}catch(IOException e) {
			
		}

	}

}

