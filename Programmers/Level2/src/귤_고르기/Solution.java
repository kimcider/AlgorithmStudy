package 귤_고르기;

import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
    	Vector<int[]> vec = new Vector<>();
    	
    	Arrays.sort(tangerine);
    	
    	int counter = 1;
    	for(int i = 1; i < tangerine.length; i++) {
    		if(tangerine[i] == tangerine[ i - 1]) {
    			counter++;
    		}else {
    			vec.add(new int[] {tangerine[i - 1], counter});
    			counter = 1;
    		}
    	}
    	vec.add(new int[] {tangerine[tangerine.length - 1], counter});
    	
    	vec.sort(new MyCom());
    	
    	int answer = 0;
    	int index = 0;
    	while( k > 0) {
    		k = k - vec.elementAt(index)[1];
    		answer ++;
    		index ++;
    	}
    	return answer;
    }
    
    class MyCom implements Comparator<int[]>{
    	public int compare(int[] a, int[]b) {
    		return Integer.compare(b[1], a[1]);
    	}
    }
}