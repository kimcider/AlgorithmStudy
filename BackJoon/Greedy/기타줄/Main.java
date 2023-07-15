package 기타줄;

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int need, brand;
			String[] temp = br.readLine().split(" ");
			need = Integer.valueOf(temp[0]);
			brand = Integer.valueOf(temp[1]);
			
			PriorityQueue<Integer> setQueue = new PriorityQueue<>();
			PriorityQueue<Integer> oneQueue = new PriorityQueue<>();
				
			for(int i = 0; i < brand; i++) {
				temp = br.readLine().split(" ");
				setQueue.offer(Integer.valueOf(temp[0]));
				oneQueue.offer(Integer.valueOf(temp[1]));
			}
			
			int setPrice = setQueue.poll();
			int onePrice = oneQueue.poll();
			
			if(setPrice > onePrice * 6) {
				setPrice = onePrice * 6;
			}
			
			int total = 0;
			if(need / 6 >= 1) {
				total = setPrice * (need / 6);
				need = need % 6;
			}
			
			if(onePrice * need > setPrice) {
				total = total + setPrice;
			}else {
				total = total + onePrice * need;	
			}
			
			
			System.out.println(total);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
