package 행렬;

import java.io.*;
import java.util.*;

public class Main {
	static int[][][] ary;
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try { 
			String[] str = br.readLine().split(" ");
			int law = Integer.valueOf(str[0]);
			int col = Integer.valueOf(str[1]);
			
			ary = new int[2][law][col];
			for(int k = 0; k < 2; k++) {
				for(int i = 0; i < law; i++) {
					String temp = br.readLine();
					for(int j = 0; j < col; j++) {
						ary[k][i][j] = temp.charAt(j) - '0';
					}
				}	
			}

			if(same() == true) {
				System.out.println(0);
				return;
			}
			int answer = 0;
			for(int i = 0; i < law - 2; i++) {
				for(int j = 0; j < col - 2; j++) {
					if(ary[0][i][j] != ary[1][i][j]) {
						swap(i,j);
						answer++;
					}
					if(same() == true) {
						System.out.println(answer);
						return;
					}

				}
			}
			System.out.println(-1);
		}catch(IOException e) {
			
		}
	}
	static void swap(int law, int col) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(ary[0][law + i][col + j] == 1) ary[0][law + i][col + j] = 0;
				else ary[0][law + i][col + j] = 1;
			}
		}
	}
	static void printMatrix(int k) {
		for(int i = 0; i < ary[k].length; i++) {
			for(int j = 0; j < ary[k][i].length; j++) {
				System.out.print(ary[k][i][j]);
			}
			System.out.println();
		}	
		System.out.println();
	}
	static boolean same() {
		boolean answer = true;
		
		for(int i = 0; i < ary[0].length; i++) {
			for(int j = 0; j < ary[0][i].length; j++) {
				if(ary[0][i][j] != ary[1][i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
