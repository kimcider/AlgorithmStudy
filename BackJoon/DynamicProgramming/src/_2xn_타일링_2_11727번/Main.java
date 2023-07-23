package _2xn_타일링_2_11727번;


import java.io.*;
import java.util.*;
public class Main {

	// 
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			if(n == 1) {
				System.out.println(1);
				return;
			}else if(n == 2) {
				System.out.println(3);
				return;
			}
			int[] list = new int[n + 1];
			list[1] = 1;
			list[2] = 3;
			for(int i = 3; i < n + 1; i++) {
				list[i] = list[i - 1] % 10007 + (list[i - 2] * 2) % 10007;
			}
			System.out.println(list[n] % 10007);
		}catch(IOException e) {
			
		}

	}

}

