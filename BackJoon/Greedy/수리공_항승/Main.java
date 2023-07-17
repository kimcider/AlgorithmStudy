package 수리공_항승;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] str = br.readLine().split(" ");
			int num = Integer.valueOf(str[0]);
			int length = Integer.valueOf(str[1]);
			
			str = br.readLine().split(" ");
			
			int[] list = new int[num];
			for(int i = 0; i < num; i++) {
				list[i] = Integer.valueOf(str[i]);
			}
			Arrays.sort(list);
			
			int answer = 1;
			int last = list[0] + length - 1;
			for(int i = 1; i < num; i++) {
				if(list[i] > last) {
					answer = answer + 1;
					last = list[i] + length - 1;
				}
			}
			System.out.println(answer);
		}catch(IOException e) {
			
		}
	}
}
