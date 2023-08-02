package DeliverAndCollect;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/150369
 */


/*
 * 문제 예시에 나온 해결방법을 그대로 사용. 
 */
class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
    	long answer = 0;
    	int maxDel = -99;
    	int maxPic = -99;
    	for(int i = n - 1; i >= 0; i--) {
    		if(deliveries[i] > 0) {
    			maxDel = i;
    			break;
    		}
    	}
    	for(int i = n - 1; i >= 0; i--) {
    		if(deliveries[i] > 0) {
    			maxPic = i;
    			break;
    		}
    	}
    	
    	while(maxPic >= 0 || maxDel >= 0) {
    		int tempCap = 0;
    		int max;
    		
    		if(maxDel > maxPic) {
    			max = maxDel;
    		}
    		else {
    			max = maxPic;
    		}
    		answer += (max + 1) * 2;
    		
    		for(int i = maxDel; i >= 0; i--) {
    			maxDel = i;
    			while(deliveries[i] > 0) {
    				deliveries[i]--;
    				tempCap++;
    				if(tempCap == cap) {
    					break;
    				}
    			}
    			
    			for(int j = i; j >= 0; j--) {
    				if(deliveries[j] == 0) {
    					maxDel = j - 1;
    				}else {
    					break;
    				}
    			}
    			
    			if(tempCap == cap) {	
    				break;
    			}
    		}
    		tempCap = 0;
    		for(int i = maxPic; i>= 0; i--) {
    			maxPic = i;
    			while(pickups[i] > 0) {
    				pickups[i]--;
    				tempCap++;
    				if(tempCap == cap) {
    					break;
    				}
    			}
    			for(int j = i; j >= 0; j--) {
    				if(pickups[j] == 0) {
    					maxPic = j - 1;
    				}else {
    					break;
    				}
    			}
    			if(tempCap == cap) {
    				break;
    			}
    		}
    	}
    	
    	
    	
    	
    	
    	
    	return answer;
    }
}
