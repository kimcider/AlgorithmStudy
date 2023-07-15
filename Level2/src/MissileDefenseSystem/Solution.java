package MissileDefenseSystem;

import java.util.*;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181188?language=java
 */
class Solution {
    public int solution(int[][] targets) {
        int answer = 1;
        
        Arrays.sort(targets, new MyComparator());

        double endPoint = targets[0][1];
        
        for(int i = 1; i < targets.length; i++) {
        	double comparedStartPoint = targets[i][0];
        	double comparedEndPoint = targets[i][1];
        	
        	if(endPoint > comparedStartPoint) {
        		if(endPoint > comparedEndPoint) endPoint = targets[i][1];
        		continue;
        	}else {
        		answer = answer + 1;
        		endPoint = targets[i][1];
        	}
        }
        return answer;
    }
    
    static class MyComparator implements Comparator<int[]>{
    	public int compare(int[] a, int[] b) {
    		if(a[0] == b[0]) {
    			return Integer.compare(a[0], b[0]);
    		}
    		return Integer.compare(a[0], b[0]);
    	}
    }
}
