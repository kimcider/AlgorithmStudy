package 수_묶기;

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.valueOf(br.readLine());
			
			PriorityQueue<Integer> positive = new PriorityQueue<>(Comparator.reverseOrder());
			PriorityQueue<Integer> negative = new PriorityQueue<>();
			int zero = 0;
			for(int i = 0; i < n; i++) {
				int num = Integer.valueOf(br.readLine());
				if(num > 0) {
					positive.offer(num);
				}else if(num < 0) {
					negative.offer(num);
				}else {
					zero++;
				}
			}
			int answer = 0;
			while(!positive.isEmpty()) {
				int num1 = positive.poll();
				if(positive.isEmpty()) {
					answer = answer + num1;
					break;
				}
				int num2 = positive.poll();
				
				if(num1 == 1 || num2 == 1) {
					answer = answer + num1 + num2;
					continue;
				}
				answer = answer + (num1 * num2);
			}
			
			while(!negative.isEmpty()) {
				int num1 = negative.poll();
				if(negative.isEmpty()) {
					if(zero == 0) {
						answer = answer + num1;
					}
					break;
				}
				int num2 = negative.poll();
				answer = answer + (num1 * num2);
			}
			System.out.println(answer);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
