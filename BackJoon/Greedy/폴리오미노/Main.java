package 폴리오미노;

import java.io.*;
import java.util.*;
public class Main {
	static String answer = "";
	static int count = 0;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			
			int index = 0;
			boolean isX = false;
			while(index < str.length()) {
				
				if(str.charAt(index) == '.') {
					if(isX == true) {
						isX = false;
						process();
					}
					answer = answer.concat(".");
				}else {
					isX = true;
					count++;
					
				}
				
				index++;
			}
//			System.out.println(count);
			process();
			System.out.println(answer);
		}catch(IOException e) {
			
		}
	}
	
	static void process() {
		if(count % 2 == 1) {
			System.out.println(-1);
			System.exit(0);
		}
		int numAAAA = count / 4;
		count = count - 4 * numAAAA;
		int numBB = count / 2;
		count = count - 2 * numBB;
		
		for(int i = 0; i < numAAAA; i++) {
			answer = answer.concat("AAAA");
		}
		for(int i = 0; i < numBB; i++) {
			answer = answer.concat("BB");
		}
	}

}
