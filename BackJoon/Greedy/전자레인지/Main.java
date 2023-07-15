package 전자레인지;

import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int time = Integer.valueOf(br.readLine());
			if (time % 10 != 0) {
				System.out.println(-1);
				return;
			}
			
			int[] button = new int[] {300, 60, 10};
			int[] count = new int[3];
			
			
			for(int i = 0; i < 3; i++) {
				if(time / button[i] >= 1) {
					count[i] = time / button[i];
					time = time - button[i] * (time / button[i]);
				}
			}
			System.out.println(count[0] + " " + count[1] + " " + count[2]);
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}

}
