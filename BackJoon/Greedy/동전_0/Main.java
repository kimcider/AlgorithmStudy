package 동전_0;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] strAry = br.readLine().split(" ");
			int numType = Integer.valueOf(strAry[0]);
			int targetValue = Integer.valueOf(strAry[1]);
			
			int[] coin = new int[numType];
			for(int i = 0; i < numType; i++) {
				coin[i] = Integer.valueOf(br.readLine().toString());
			}
			
			int answer = 0;
			int index = numType - 1;
			while(targetValue > 0) {
				if(targetValue / coin[index] >= 1) {
					answer = answer + (targetValue / coin[index]);
					targetValue = targetValue - coin[index] * (targetValue / coin[index]);
				}
				
				index = index - 1;
			}
			System.out.println(answer);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
