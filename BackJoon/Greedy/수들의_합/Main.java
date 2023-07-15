package 수들의_합;

import java.io.*;

public class Main {
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			long num = Long.valueOf(br.readLine());

			int i = 0;
			
			while(num > i) {
				i++;
				num = num - i;
			}
			System.out.println(i);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
