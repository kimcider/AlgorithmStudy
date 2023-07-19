package 센서;

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Integer N = Integer.valueOf(br.readLine());
			Integer K = Integer.valueOf(br.readLine());
			
			String[] str = br.readLine().split(" ");
			int[] list = new int[N];
			for(int i = 0; i < N ;i++) {
				list[i] = Integer.valueOf(str[i]);
			}
			Arrays.sort(list);
//			System.out.println(Arrays.toString(list));
			
			int[] gap = new int[N - 1];
			int answer = 0;
			for(int i = 0; i < N - 1; i++) {
				gap[i] = list[i + 1] - list[i];
			}
			Arrays.sort(gap);
//			System.out.println(Arrays.toString(gap));
			for(int i = 0; i < N - K; i++) {
				answer += gap[i];
			}
			
			System.out.println(answer);
		}catch(IOException e) {
			
		}
	}
}
