package AtoB_16953번;

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[]str = br.readLine().split(" ");
			int original = Integer.valueOf(str[0]);
			int changed = Integer.valueOf(str[1]);
			
			int answer = 0;
			while(changed > original) {
				if(changed % 2 == 0) {
					changed = changed / 2;
					answer++;
				}
				else {
					if(changed % 10 != 1) {
						System.out.println(-1);
						return;
					}else {
						changed = changed / 10;
						answer++;
					}
				}
			}
			if(changed == original) {
				System.out.println(answer + 1);
			}else {
				System.out.println(-1);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
