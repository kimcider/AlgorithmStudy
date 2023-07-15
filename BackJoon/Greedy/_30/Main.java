package _30;

import java.io.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			
			int[] ary = new int[10];
			for(int i = 0; i < str.length(); i++) {
				ary[str.charAt(i) - '0']++;
			}
			
			if(ary[0] == 0) {
				System.out.println(-1);
				return;
			}
			
			int sum = 0;
			for(int i = 1; i < 10; i++) {
				sum = sum + ary[i] * i;
			}
			
			if(sum % 3 != 0) {
				System.out.println(-1);
				return;
			}
			
			
			for(int i = 9; i >= 0; i--) {
				for(int j = 0; j < ary[i]; j++) {
					System.out.print(i);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
