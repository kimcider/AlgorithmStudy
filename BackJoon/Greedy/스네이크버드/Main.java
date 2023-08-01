package 스네이크버드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] str = br.readLine().split(" ");
			int n = Integer.valueOf(str[0]);
			int len = Integer.valueOf(str[1]);
			
			str = br.readLine().split(" ");
			int[] height = new int[n];
			for(int i = 0; i < str.length; i++) {
				height[i] = Integer.valueOf(str[i]);
			}
			
			Arrays.sort(height);
			
			
			for(int i = 0; i < n; i++) {
				if(height[i] <= len) {
					len++;
				}else break;
			}
			System.out.println(len);
		}catch(IOException e) {
			
		}
	}	
}
