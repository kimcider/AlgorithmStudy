package 포도주_시식;


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
			
			if(n == 1) {
				System.out.println(ary[0]);
				return;
			}else if(n == 2) {
				System.out.println(ary[0] + ary[1]);
				return;
			}
			
			long[] way1 = new long[n];
			long[] way2 = new long[n];
			
			
			way1[0] = ary[0];
			way2[0] = 0;
			way1[1] = ary[0] + ary[1];
			way2[1] = ary[1];
			
			long max = 0;
			for(int i = 2; i < n; i++) {
				if(ary[i] == 0) {
					if(way1[i - 1] > way2[i - 1]) {
						way1[i] = 0;
						way2[i] = way1[i - 1];
					}else {
						way1[i] = 0;
						way2[i] = way2[i - 1];
					}
					if(way1[i] > max) {
						max = way1[i];
					}
					if(way2[i] > max) {
						max = way2[i];
					}
					continue;
				}
				way1[i] = way2[i - 1] + ary[i];
				if(way1[i - 2] > way2[i - 2]) {
					way2[i] = way1[i - 2] + ary[i];
				}else {
					way2[i] = way2[i - 2] + ary[i];
				}
				if(way1[i] > max) {
					max = way1[i];
				}
				if(way2[i] > max) {
					max = way2[i];
				}
			}
			System.out.println(max);
//			System.out.println(Arrays.toString(way1));
//			System.out.println(Arrays.toString(way2));
			
		}catch(IOException e) {
			
		}

	}

}