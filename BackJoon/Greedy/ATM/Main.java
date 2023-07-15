package ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int number = Integer.parseInt(br.readLine());
			String[] numString = br.readLine().split(" ");
			
			int[] ary = new int[number];
			for(int i = 0; i < number; i++) {
				ary[i] = Integer.valueOf(numString[i]);
			}
			
			Arrays.sort(ary);
			
			for(int i = 1; i < number; i++) {
				ary[i] = ary[i] + ary[i - 1];
			}
			
			int answer = 0;
			for(int i = 0; i < number; i++) {
				answer = answer + ary[i];
			}
			
			System.out.println(answer);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
