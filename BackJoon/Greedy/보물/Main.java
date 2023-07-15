package 보물;

import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			int[] A = new int[n];
			int[] B = new int[n];
			
			String[] strA = br.readLine().split(" ");
			String[] strB = br.readLine().split(" ");
			
			for(int i = 0; i < n; i++) {
				A[i] = Integer.valueOf(strA[i]);
				B[i] = Integer.valueOf(strB[i]);
			}
			Arrays.sort(A);
			Arrays.sort(B);
			
			int answer = 0;
			for(int i = 0; i < n; i++) {
//				System.out.println("A["+i+"]: "+A[i]+", B["+ (n - (i + 1)) +"]: "+B[n - (i + 1)]);
				answer = answer + (A[i] * B[n - (i + 1)]);
			}
			
			System.out.println(answer);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
