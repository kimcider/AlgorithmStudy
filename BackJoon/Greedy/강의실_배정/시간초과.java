package 강의실_배정;
import java.io.*;
import java.util.*;
public class 시간초과 {
	static TreeMap<Integer, TreeMap<Integer, Integer>> map = new TreeMap<>();
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.valueOf(br.readLine());
			
			for(int i = 0; i < n; i++) {
				String[] str = br.readLine().split(" ");
				int start = Integer.valueOf(str[0]);
				int end = Integer.valueOf(str[1]);
				
				if(map.containsKey(end)) {
					TreeMap<Integer, Integer> innerMap = map.get(end);
					if(innerMap.containsKey(start)) {
						innerMap.put(start, innerMap.get(start) + 1);						
					}else {
						innerMap.put(start, 1);
					}
					

					map.put(end, innerMap);
				}else {
					TreeMap<Integer, Integer> innerMap = new TreeMap<>();
					innerMap.put(start, 1);					
					map.put(end, innerMap);
				}
			}
			
//			System.out.println("map: "+ map);
//			int mapSize = map.size();
//			for(int i = 0; i < mapSize; i++) {
//				System.out.println();
//				int key = map.firstKey();
//				TreeMap<Integer, Integer> innerMap = map.get(key);
//				System.out.println("<"+i + "'s innerMap: " + innerMap+">");
//				map.remove(key);
//				int innerSize = innerMap.size();
//				for(int j = 0; j < innerSize; j++) {
//					System.out.println(j + "'s innerMaps'entry: " + innerMap.pollFirstEntry());
//				}
//			}
			
			int counter = 0;
			
			int answer = 0;
			while(!map.isEmpty()) {
				answer++;
//				System.out.println("\n\nouterLoopStart");
//				System.out.println("before map: " + map);
				
				int endTime = map.firstKey();
				TreeMap<Integer, Integer> innerMap = map.get(endTime);
//				System.out.println("innerMap: " + innerMap);
				int innerKey = innerMap.firstKey();
				reduce(endTime, innerKey);
				
				int nextEndTime = endTime;
				while(true) {
					try {
						nextEndTime = map.higherKey(nextEndTime);
//						System.out.println("nextKey: " + nextEndTime);		
						innerMap = map.get(nextEndTime);
						
						int startTime = innerMap.firstKey();
						while(true) {
							if(endTime <= startTime) {
								endTime = nextEndTime;
								reduce(endTime, startTime);
								break;
							}else {
								try {
									startTime = innerMap.higherKey(startTime);									
								}catch(NullPointerException e) {
									break;
								}

							}
						}
					}catch(NullPointerException e) {
						break;
					}
				}
				
//				System.out.println("after map: " + map);
			}
//			System.out.println("answer: " + answer);
			System.out.println(answer);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	static void reduce(int key, int innerKey) {
		TreeMap<Integer, Integer> innerMap = map.get(key);
		innerMap.put(innerKey, innerMap.get(innerKey) - 1);
		if(innerMap.get(innerKey) == 0) {
			innerMap.remove(innerKey);
		}
		
		if(innerMap.isEmpty()) {
			map.remove(key);
		}
	}
	static class MyCom implements Comparator<int[]>{
		public int compare(int[]a, int[]b) {
			if(a[1] != b[1]) {
				return a[1] - b[1];
			}else {
				return a[0] - b[0];
			}
		}
	}
}