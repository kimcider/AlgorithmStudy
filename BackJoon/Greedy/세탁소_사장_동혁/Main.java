package 세탁소_사장_동혁;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			
			int[] unit = new int[] {25, 10, 5, 1};
			for(int i = 0; i < n; i++) {
				int changes = Integer.valueOf(br.readLine());
				
				for(int j = 0; j < 4; j++) {
					if(changes / unit[j] >= 1) {
						System.out.print(changes/unit[j] + " ");
						changes = changes - unit[j] * (changes / unit[j]);
					}else {
						System.out.print(0 + " ");
					}
				}
				System.out.println();
			}

		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
