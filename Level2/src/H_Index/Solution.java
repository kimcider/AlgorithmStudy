package H_Index;

import java.util.*;
class Solution {
    public int solution(int[] citations) {
        
        
        Arrays.sort(citations);
        
        System.out.println(Arrays.toString(citations));
        int answer = 0;

        for(int i = citations.length - 1; i >= 0; i--) {
        	answer++;
        	System.out.println("answer: "+ answer+", citations[i]: "+citations[i]);
        	if(answer == citations[i]) {
        		return answer;
        	}
        	if(answer > citations[i]) {
        		return answer - 1;
        	}
        	
        }
        
        return answer;
        
    }
}