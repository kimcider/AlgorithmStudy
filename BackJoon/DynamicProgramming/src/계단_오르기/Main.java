package 계단_오르기;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			int[] ary = new int[n + 1];
			for(int i = 1; i < n + 1; i++) {
				ary[i] = Integer.valueOf(br.readLine());
			}
			
			if(n == 1) {
				System.out.println(ary[1]);
				return;
			}else if(n == 2) {
				System.out.println(ary[1]+ary[2]);
				return;
			}
//			int[] W = new int[n + 1];
//			int[] step1 = new int[n + 1];
//			int[] step2 = new int[n + 1];
//			step1[1] = 1;
//			step1[2] = 1;
//			step1[3] = 1;
//			step2[1] = 0;
//			step2[2] = 1;
//			step2[3] = 1;
//			System.out.println("ary: " + Arrays.toString(ary));
//			for(int i = 0; i < 4; i++) {
//				W[i] = step1[i] + step2[i];
//			}
//			for(int i = 4; i < n + 1; i++) {
//				step1[i] = step2[i - 1];
//				step2[i] = W[i - 2];
//				W[i] = step1[i] + step2[i];
//			}
//			System.out.println("step1: " + Arrays.toString(step1));
//			System.out.println("step2: " + Arrays.toString(step2));
//			System.out.println("W: " + Arrays.toString(W));
			
			int[] score1 = new int[n + 1];
			int[] score2 = new int[n + 1];
			score1[1] = ary[1];
			score1[2] = ary[1] + ary[2];
//			score1[3] = ary[2] + ary[3];
			score2[2] = ary[2];
//			score2[3] = ary[1] + ary[3];
			
			for(int i = 3; i < n + 1; i++) {
				score1[i] = score2[i - 1] + ary[i];
				
				if(score1[i - 2] > score2[i - 2]) {
					score2[i] = score1[i - 2] + ary[i];
				}else {
					score2[i] = score2[i - 2] + ary[i];
				}
			}
			
			if(score1[n] > score2[n]) {
				System.out.println(score1[n]);
			}else {
				System.out.println(score2[n]);
			}
		}catch(IOException e) {
			
		}

	}

}

