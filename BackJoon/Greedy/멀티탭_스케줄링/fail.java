package 멀티탭_스케줄링;
//package 멀티탭_스케줄링;
//

/*
// * nextPosition이 꾸준히 갱신되어야함...
// * 
// */
//import java.io.*;
//import java.util.*;
//public class fail {
//	static int INF = 9999;
//	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			String[] str = br.readLine().split(" ");
//			int numberofTap = Integer.valueOf(str[0]);
//			int n = Integer.valueOf(str[1]);
//			
//			str = br.readLine().split(" ");
//			int[] order = new int[n];
//			int[] nextPosition = new int[n];
//			int[] numbers = new int[101];
//			for(int i = 1; i <= 100; i++) {
//				numbers[i] = INF;
//			}
//			
//			
//			for(int i = n - 1; i >= 0; i--) {
//				order[i] = Integer.valueOf(str[i]);
//				if(numbers[order[i]] == INF) {
//					nextPosition[i] = INF;
//				}else {
//					nextPosition[i] = numbers[order[i]] - i;	
//				}
//				numbers[order[i]] = i;
////				System.out.println("order[" + i + "]: " + order[i]);
////				System.out.println("nextPosition[" + i + "]: " + nextPosition[i]);
////				System.out.println("numbers[" + order[i] + "]: " + numbers[order[i]]);
////				System.out.println();
//			} 
//			
//			for(int i = 0; i <= 100; i++) {
//				numbers[i] = INF;
//			}
//			
//			PriorityQueue<int[]> queue = new PriorityQueue<>(new MyCom());
//			boolean[] check = new boolean[101];
//			for(int i = 0; i < numberofTap; i++) {
//				queue.offer(new int[] {order[i], nextPosition[i]});
//				check[order[i]] = true;
////				tap[i] = order[i];
//				numbers[order[i]] = i;
////				System.out.println(tap[i]);
//			}
//			
//			
//			int answer = 0;
//			for(int i = numberofTap; i < n; i++) {
//				queue.forEach(item -> item[1] = item[1] - 1);
//				
////				System.out.println(order[i] + " " +numbers[order[i]]);
//				
//				if(numbers[order[i]] >= 500 && (i - numbers[order[i]]) < numberofTap) {
//					//n개의 탭이 있을 경우 n개스케쥴 내에 다시사용되니 할 필요 없음.
////					System.out.println("되나?");
//					continue;
//				}else {
//					int[] temp = queue.poll();
//					if(check[order[i]] != true) {
////						System.out.println(temp[0] + "out!!");
//						check[temp[0]] = false;
//						check[order[i]] = true;
//						answer ++;
//					}
////					System.out.println("추가: " + order[i] + " " + nextPosition[i]);
//					queue.offer(new int[] {order[i], nextPosition[i]});
//				}
//				numbers[order[i]] = i;
//			}
//			
//			System.out.println(answer);
//		}catch(IOException e) {
//			
//		}
//	}
//	static class MyCom implements Comparator<int[]>{
//		public int compare(int[]a, int[]b) {
//			return b[1] - a[1];
//		}
//	}
//}
//
//
