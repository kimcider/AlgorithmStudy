package 로프;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int num = Integer.valueOf(br.readLine());
			Integer[] lope = new Integer[num];
			for(int i = 0; i < num; i++) {
				lope[i] = Integer.valueOf(br.readLine());
			}
			
//			이런식으로하면 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 이런 케이스에서 답이 8이됨. 
//			Arrays.sort(lope, Collections.reverseOrder());
//
//			int max = lope[0];
//			for(int i = 1; i < num; i++) {
//				if((lope[i] * (i + 1) > max)) {
//					max = lope[i] * (i + 1);
//				}else {
//					break;
//				}
//			}
			
			Arrays.sort(lope);
			int max = 0;
			for(int i = 0; i < num; i++) {
				if(lope[i] * (num - i) > max){
					max = lope[i] * (num - i);
				}
			}
			System.out.println(max);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
