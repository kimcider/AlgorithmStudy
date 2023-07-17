package 저울;

import java.io.*;
import java.util.*;

/*
 * 1, 3, 5 = 2
 * 1, 2, 3, 5 = 12
 */
public class Main {
	static int[] ary;
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			ary = new int[n];
			boolean[] valid = new boolean[n];
			for(int i = 0; i < n; i++) {
				valid[i] = true;
			}
			String[] temp = br.readLine().split(" ");
			for(int i = 0; i < n; i++) {
				ary[i] = Integer.valueOf(temp[i]);
			}
			
			Arrays.sort(ary);
			System.out.println(Arrays.toString(ary));
			
		}catch(IOException e) {
			
		}
	}
}
