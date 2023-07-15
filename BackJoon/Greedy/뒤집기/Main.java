package 뒤집기;

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str = br.readLine();
			
			char pre;
			
			int[] counter = new int[2];
			if(str.charAt(0) == '0') {
				pre = '0';
				counter[0] = 1;
			}else {
				pre = '1';
				counter[1] = 1;
			}
			for(int i = 1; i < str.length(); i++) {
				if(str.charAt(i) != pre) {
					pre = str.charAt(i);
					counter[str.charAt(i) - '0']++;
				}
			}
			if(counter[0]>counter[1]) {
				System.out.println(counter[1]);
			}else {
				System.out.println(counter[0]);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
