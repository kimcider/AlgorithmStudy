package 카드_정렬하기;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.valueOf(br.readLine());
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			
			for(int i = 0;i < n; i++) {
				pq.offer(Integer.valueOf(br.readLine()));
			}
			
			int sum = 0;
			while(true) {
				int a = pq.poll();
				
				if(pq.isEmpty()) {
					System.out.println(sum);
					return;
				}
				int b= pq.poll();
				int temp = a + b;
				sum = sum + temp;
				pq.offer(temp);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
