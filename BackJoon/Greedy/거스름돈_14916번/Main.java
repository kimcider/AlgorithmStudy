package 거스름돈_14916번;

/* 
 * 3 16 17
 */

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Integer change = Integer.valueOf(br.readLine());
			int answer = 0;
			if(change % 2 == 0) {
				if(change >= 10) {
					answer = answer + 2 *(change / 10);
					change = change - 10 * (change / 10);
				}
				answer = answer + (change / 2);
			}else {
				answer = 1;
				change = change - 5;
				if(change < 0) {
					System.out.println(-1);
					return;
				}
				if(change >= 10) {
					answer = answer + 2 * (change / 10);
					change = change - 10 * (change / 10);
				}
				
				
				answer = answer + (change / 2);
			}
			System.out.println(answer);
		}catch(IOException e) {
			
		}
	}
}
