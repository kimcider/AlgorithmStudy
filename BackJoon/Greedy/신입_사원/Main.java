package 신입_사원;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.valueOf(br.readLine());
			for(int i = 0; i < t; i++) {
				int n = Integer.valueOf(br.readLine());
				
				PriorityQueue<int[]>pq = new PriorityQueue<>(new MyCom());
				
				for(int j = 0; j < n; j++) {
					String[]arg = br.readLine().split(" ");
					pq.offer(new int[] {Integer.valueOf(arg[0]), Integer.valueOf(arg[1])});
						
				}
				
				int answer = 1;
				int[] temp = pq.poll();
				int min = temp[1];
				while(!pq.isEmpty()) {
					temp = pq.poll();
					if(temp[1] < min) {
						min = temp[1];
						answer++;
					}
				}
				System.out.println(answer);
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	static class MyCom implements Comparator<int[]>{
		public int compare(int[]a , int[]b) {
			return a[0] - b[0];
		}
	}
}
