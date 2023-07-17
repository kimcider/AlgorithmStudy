package 팰린드롬_만들기;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int[] alpha = new int[26];
			for(int i = 0; i < str.length(); i++) {
				alpha[(str.charAt(i) - 'A')]++;
			}
			
			boolean can = true;
			for(int i = 0; i < 26; i++) {
				if(alpha[i] % 2 == 1) {		
					if(can == true) {
						can = false;
					}else {
						System.out.println("I'm Sorry Hansoo");
						return;
					}
				}
			}
			
			
			int odd = 999;
			for(int i = 0; i < 26; i++) {
				if(alpha[i] % 2 == 1) {
					odd = i;
				}
				int count = alpha[i] / 2;
				alpha[i] = alpha[i] - count;
				for(int j = 0; j < count; j++) {
					System.out.print((char)(i + 'A'));	
				}
			}
			if(odd != 999) {
				System.out.print((char)(odd + 'A'));
				alpha[odd] = alpha[odd] - 1;
			}
			for(int i = 25; i >= 0; i--) {
				for(int j = 0; j < alpha[i]; j++) {
					System.out.print((char)(i + 'A'));	
				}
			}
			
			System.out.println();
		}catch(IOException e) {
			
		}
	}
}
