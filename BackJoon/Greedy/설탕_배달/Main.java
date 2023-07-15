package 설탕_배달;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int weight = -1;
		try {
			weight = Integer.parseInt(br.readLine());
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		int answer = 0;
		
		boolean condition = false;
		while(weight > 0) {
			if(weight % 5 == 0) {
				answer += weight / 5;
				condition = true;
				break;
			}else {
				weight = weight - 3;
				answer = answer + 1;
				
				if(weight == 0) {
					condition = true;
				}
			}
		}
		
		if(condition == false) {
			System.out.println(-1);
		}else {
			System.out.println(answer);
		}
	}
}
