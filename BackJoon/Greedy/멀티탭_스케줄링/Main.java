package 멀티탭_스케줄링;


import java.io.*;
import java.util.*;
public class Main {
	static TreeMap<Integer, TreeSet<Integer>> map = new TreeMap<>();
	static TreeSet<Integer> tap = new TreeSet<>();
	public static void main(String[] args) {
		int INF = 9999;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {	
			String[] str = br.readLine().split(" ");
			int N = Integer.valueOf(str[0]);
			int K = Integer.valueOf(str[1]);
			
			str = br.readLine().split(" ");
			int[] order = new int[K];
			for(int i = 0; i < K; i++) {
				order[i] = Integer.valueOf(str[i]);
				Integer num = Integer.valueOf(str[i]);
				
				TreeSet<Integer> set;
				if(map.containsKey(num)) {
					set = map.get(num);
				}else {
					set = new TreeSet<>();
				}
				set.add(i);
				map.put(num, set);
			}
			for(int i = 0; i < N; i++) {
				plugIn(order[i]);
			}
			int answer = 0;
			for(int i = N; i < K; i++) {
				if(tap.contains(order[i])) {
					tap.remove(order[i]);
					plugIn(order[i]);
					continue;
				}
				if(tap.size() < N) {
					plugIn(order[i]);
					continue;
				}
				answer ++;
				int key = tap.first();
				int max = 0;
				int maxKey = 0;
				for(int j = 0; j < N; j++) {
					try {
						int num = map.get(key).first();
						if(num > max) {
							max = num;
							maxKey = key;
						}
						
						try {
							key = tap.higher(key);
						}catch(NullPointerException e) {
							break;
						}
					}catch(NullPointerException e) {
						max = 9999;
						maxKey = key;
						continue;
					}
				}
//				System.out.println("remove " + maxKey);
				tap.remove(maxKey);
				plugIn(order[i]);
			}
			System.out.println(answer);
		}catch(IOException e) {
			
		}
	}
	
	static void plugIn(int n) {
		tap.add(n);
		TreeSet<Integer> innerSet = map.get(n);
		innerSet.pollFirst();
		if(innerSet.isEmpty()) map.remove(n);
		else map.put(n, innerSet);
	}
}

