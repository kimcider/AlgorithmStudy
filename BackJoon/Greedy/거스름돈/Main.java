package 거스름돈;

import java.io.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int price = Integer.valueOf(br.readLine());
			int change = 1000 - price;
			
			int[] unit = new int[] {500, 100, 50, 10, 5, 1};
			
			int answer = 0;
			int unitIndex = 0;
			while(change > 0) {
				if(change / unit[unitIndex] >= 1) {
					answer = answer + (change / unit[unitIndex]);
					change = change - unit[unitIndex] * (change / unit[unitIndex]);
				}
				unitIndex = unitIndex + 1;
			}
			System.out.println(answer);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
