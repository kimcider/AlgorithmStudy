package 카드_합체_놀이;

import java.io.*;
import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[]str = br.readLine().split(" ");
			int N = Integer.valueOf(str[0]);
			int M = Integer.valueOf(str[1]);
			
			PriorityQueue<BigInteger> queue = new PriorityQueue<>();
			str = br.readLine().split(" ");
			for(int i = 0; i < N; i++) {
				queue.add(new BigInteger(str[i]));
			}
			
			for(int i = 0; i < M; i++) {
				BigInteger num1 = queue.poll();
				BigInteger num2 = queue.poll();
				
				BigInteger sum = num1.add(num2);
				queue.add(sum);
				queue.add(sum);
			}
			
			BigInteger answer = new BigInteger("0");
			while(!queue.isEmpty()) {
				answer = answer.add(queue.poll());
			}
			System.out.println(answer);
			
		}catch(IOException e) {
			
		}

	}

}
