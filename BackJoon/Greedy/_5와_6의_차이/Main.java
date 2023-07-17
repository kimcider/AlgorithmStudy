package _5와_6의_차이;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] str = br.readLine().split(" ");
			
			int max = 0;
			int min = 0;
			for(int i = 0; i < 2; i++) {
					str[i] = str[i].replaceAll("5", "6");
//					System.out.println(str[i]);
					max = max + Integer.valueOf(str[i]);
					str[i] = str[i].replaceAll("6","5");
					min = min + Integer.valueOf(str[i]);
			}
			System.out.println(min + " " + max);
			
		}catch(IOException e) {
			
		}
	}
}
