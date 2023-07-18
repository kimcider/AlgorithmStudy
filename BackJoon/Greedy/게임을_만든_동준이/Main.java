package 게임을_만든_동준이;

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			int[] ary = new int[n];
			for(int i = 0; i < n; i++) {
				ary[i] = Integer.valueOf(br.readLine());
			}
			
			int last = ary[ary.length - 1];
			int answer = 0;
			for(int i = ary.length - 2; i >= 0; i--) {
				if(ary[i] >= last) {
//					System.out.println("before: ary[i]: " + ary[i] +", last: " + last);
					int gap = ary[i] - last + 1;
					ary[i] = ary[i] - gap;
					last = ary[i];
					answer = answer + gap;
//					System.out.println("after: ary[i]: " + ary[i] +", last: " + last);
					
				}else {
					last = ary[i];
				}
			}
			System.out.println(answer);
		}catch(IOException e) {
			
		}
	}

}
