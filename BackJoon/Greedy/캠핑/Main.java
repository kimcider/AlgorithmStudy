package 캠핑;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int i = 1;
			while(true) {
				String[] str = br.readLine().split(" ");
				if(str[0].charAt(0) == '0') {
					break;
				}
				
				int L = Integer.valueOf(str[0]);
				int P = Integer.valueOf(str[1]);
				int V = Integer.valueOf(str[2]);
				
				int cycle = V / P;
				int mod = V % P;
				int answer = L * cycle;
				if(mod >= L) {
					answer = answer + L;
				}else {
					answer = answer + mod;
				}
				System.out.println("Case " + i + ": " + answer);
				i = i + 1;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
