package 단어_수학;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.valueOf(br.readLine());
			
			Integer[] ary = new Integer[26];
			for(int i = 0; i < 26; i++) {
				ary[i] = 0;
			}
			for(int i = 0; i < n ;i++) {
				String temp = br.readLine();
				int unit = 1;
				for(int j = temp.length() - 1; j >= 0 ; j--) {
					ary[temp.charAt(j) - 'A'] = ary[temp.charAt(j) - 'A'] + unit;
					unit = unit * 10;
				}
			}
			
			Arrays.sort(ary, Comparator.reverseOrder());
			
			int sum = 0;
			for(int i = 0; i < 10; i++) {
				sum = sum + ((9 - i) * ary[i]);
			} 
			System.out.println(sum);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
