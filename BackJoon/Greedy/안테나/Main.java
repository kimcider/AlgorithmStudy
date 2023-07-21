package 안테나;

import java.io.*;
import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			
			int[]list = new int[n];
			String[] str = br.readLine().split(" ");
			int sum = 0;
			for(int i = 0; i < n; i++) {
				list[i] = Integer.valueOf(str[i]);
				sum = sum + list[i];
			}
			
			double avg = sum / n;
			System.out.println("avg: " + avg);
			Arrays.sort(list);
			double gap = Double.MAX_VALUE;
			
			int mid = Integer.MAX_VALUE;
			for(int i = 0 ; i < n; i++) {
				if(Math.abs((double)list[i] - avg) < gap) {
					gap = Math.abs((double)list[i] - avg);
//					System.out.println("list[" + i + "], gap: " + gap);
				}else if(Math.abs((double)list[i] - avg) == gap){
					if( (i - 1) + 1 > (n - 1) - (i - 1)) {
						mid = list[i - 1];
						break;
					}
				}else {
//					System.out.println(i);
					mid = list[i - 1];
					break;
				}
			}
			
			BigInteger answer = new BigInteger;
			for(int i = 0; i < n; i++) {
				answer = answer + Math.abs(list[i] - mid);
			}
//			int answer = 0;
//			for(int i = 0; i < n; i++) {
//				answer = answer + Math.abs(list[i] - avg);
//			}
//			
			System.out.println(mid);
			System.out.println(answer);
		}catch(IOException e) {
			
		}

	}

}
