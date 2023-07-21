package A와_B;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			StringBuilder target = new StringBuilder();
			StringBuilder origin = new StringBuilder();
			
			target.append(br.readLine());
			origin.append(br.readLine());
			
			while(target.length() < origin.length()) {
				if(origin.charAt(origin.length() - 1) == 'B') {
					origin.deleteCharAt(origin.length() - 1);
					origin.reverse();
//					if(origin.toString().equals(target.toString())) {
//						System.out.println(1);
//						return;
//					}else {
//						origin.reverse();
//					}
				}else if(origin.charAt(origin.length() - 1) == 'A'){
					origin.deleteCharAt(origin.length() - 1);
				}else {
					System.out.println(0);
					return;
				}

				if(origin.toString().equals(target.toString())) {
					System.out.println(1);
					return;
				}
				
			}
			System.out.println(0);
			
		}catch(IOException e) {
			
		}

	}

}
