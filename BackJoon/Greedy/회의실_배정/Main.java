package 회의실_배정;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.valueOf(br.readLine().toString());
			
			int[][] entry = new int[n][2];
			for(int i = 0; i < n; i++) {
				String[] temp = br.readLine().split(" ");
				entry[i][0] = Integer.valueOf(temp[0]);
				entry[i][1] = Integer.valueOf(temp[1]);
			}
			
			Arrays.sort(entry, new MyComparator());
			
			for(int i = 0; i < n; i++) {
				System.out.println(entry[i][0] + " "+entry[i][1]);
			}
			
			int answer = 1;
			int endTime = entry[0][1];
			for(int i = 1; i < n; i++) {
				if(entry[i][0] >= endTime) {
					endTime = entry[i][1];
					answer = answer + 1;
				}
			}
			System.out.println(answer);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static class MyComparator implements Comparator<int[]>{
		public int compare(int a[], int b[]) {
			if(a[1] != b[1]) return a[1] - b[1];
			else return a[0] - b[0];
		}
	}
}
