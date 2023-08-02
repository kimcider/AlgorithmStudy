package 구명보트;
	
import java.util.*;
	
class Solution {
	public int solution(int[] people, int limit) {
		int answer = 0;
	    	
		Arrays.sort(people);
		for(int i = 0;i < people.length; i++) {
			System.out.print(" " + people[i]);
		}
		System.out.println();
		
		int leftWing = 0;
		int rightWing = people.length - 1;
		
		while(leftWing <= rightWing) {
//			System.out.println("tot = "+ (leftWing + rightWing));
			if(people[leftWing] + people[rightWing] > limit) {
				rightWing--;
				answer++;
			}else {
				rightWing--;
				leftWing++;
				answer++;
			}
		}
	    	
		return answer;
	}
}