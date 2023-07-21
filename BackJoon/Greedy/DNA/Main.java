package DNA;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[]str = br.readLine().split(" ");
			int n = Integer.valueOf(str[0]);
			int len = Integer.valueOf(str[1]);
			
			String[] list = new String[n];
			for(int i = 0; i < n; i++) {
				list[i] = br.readLine();
			}
			
			StringBuilder answer = new StringBuilder();
			int answerNumber = 0;
			
			int[] counter = new int[4];
			
			for(int i = 0; i < len; i++) {
				for(int j = 0; j < n; j++) {
					if(list[j].charAt(i) == 'A') {
						counter[0]++;
					}else if(list[j].charAt(i) == 'C') {
						counter[1]++;
					}else if(list[j].charAt(i) == 'G') {
						counter[2]++;
					}else {
						counter[3]++;
					}
				}
				
//				System.out.println(Arrays.toString(counter));
				
				int max = counter[0];
				int maxIndex = 0;
				answerNumber = answerNumber + counter[0];
				for(int j = 1; j < 4; j++) {
					if(counter[j] > max) {
						max = counter[j];
						maxIndex = j;
					}
					answerNumber = answerNumber + counter[j];
				}
				
//				System.out.println(maxIndex);
				answerNumber = answerNumber - counter[maxIndex];
				if(maxIndex == 0) {
					answer.append('A');
				}else if(maxIndex == 1) {
					answer.append('C');
				}else if(maxIndex == 2) {
					answer.append('G');
				}else {
					answer.append('T');
				}
				
//				System.out.println(answer);
				for(int j = 0; j < 4; j++) {
					counter[j] = 0;
				}
			}
			System.out.println(answer);
			System.out.println(answerNumber);
			
		}catch(IOException e) {
			
		}

	}

}

