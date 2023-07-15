package 주유소;

import java.io.*;
import java.util.Arrays;
import java.math.BigInteger;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			
			int[] city = new int[n - 1];
			int[] dist = new int[n - 1];
			
			String[] ary = br.readLine().split(" ");
			for(int i = 0; i < n - 1; i++) {
				dist[i] = Integer.valueOf(ary[i]);
			}
			
			ary = br.readLine().split(" ");
			for(int i = 0; i < n - 1; i++) {
				city[i] = Integer.valueOf(ary[i]);
			}
			
			int[] chip = new int[n - 1];
			int min = city[0];
			for(int i = 0; i < n - 1; i++) {
				if(city[i] < min) {
					min = city[i];
				}
				chip[i] = min;
			}
			
			System.out.println("city: " + Arrays.toString(city));
			System.out.println("dist: " + Arrays.toString(dist));
			System.out.println("chip: " + Arrays.toString(chip));
			
			BigInteger cost = BigInteger.valueOf(0);
			for(int i = 0; i < n - 1; i++) { 
//				cost = cost + (chip[i] * dist[i]);
				cost = BigInteger.valueOf(chip[i]).multiply(BigInteger.valueOf(dist[i])).add(cost);
			}
			
	        System.out.println(cost);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
