package 가장_긴_증가하는_부분_수열_5;

import java.io.*;
import java.util.*;
public class 왜안되는지도저히이해할수가없다 {
	static int[] ary;
	static boolean test = false;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.valueOf(br.readLine());
			String[] str = br.readLine().split(" "); 
			ary = new int[n];
			for(int i = 0; i < n; i++) {
				ary[i] = Integer.valueOf(str[i]);
			}
			
			int[] trace = new int[n];
			trace[0] = 0;
			
			int[] temp = new int[n];
			int index = 0;
			temp[0] = ary[0];
			for(int i = 1; i < n; i++) {
				if(test == true) {
					System.out.println("\n" + Arrays.toString(temp));
					System.out.println("i: " + i + ", ary[" + i + "]: " + ary[i]);	
				}
				
				
				if(temp[index] < ary[i]) {
					if(test) System.out.println("apend");
					index++;
					temp[index] = ary[i];
					trace[i] = index;
					
				}else {
					int left = 0;
					int right = index;
					
					int mid = (right + left) / 2;
					while(left < right) {
						mid = (right + left) /2;
						if(temp[mid] == ary[i]) {
							break;
						}else if(temp[mid] > ary[i]) {
							right = mid - 1;
						}else {
							left = mid + 1;
						}
					}
					if(test) {
						System.out.println("left: " + left);
						System.out.println("mid: " + mid);
						System.out.println("right: " + right);	
					}
					
					int min = 0;
					int max = 0;
					if(left > mid) {
						min = mid;
						max = left;
					}else {
						min = left;
						max = mid;
					}
					
					if(test) System.out.println("min: " + min + ", max: " + max);
					if(temp[min] == ary[i]) {
						trace[i] = min;
					}
					else if(ary[i] < temp[min]) {
						temp[min] = ary[i];
						trace[i] = min;
					}else {
						temp[max] = ary[i];
						trace[i] = max;
					}
					
				}
			}
			
			if(test) {
				System.out.println(Arrays.toString(temp));
				System.out.println(Arrays.toString(trace));
				System.out.println(index);	
			}
			
			
			Stack<Integer> stack = new Stack<>();
			for(int i = n - 1; i >= 0 && index >= 0; i--) {
				if(trace[i] == index) {
					index--;
					stack.push(ary[i]);
				}
			}
			
			System.out.println(stack.size());
			while(!stack.isEmpty()) {
				if(stack.size() != 1)
				System.out.print(stack.pop() + " ");
				else
					System.out.println(stack.pop());
			}
			
		}catch(IOException e) {
			
		}

	}
}

