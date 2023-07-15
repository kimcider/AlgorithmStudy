package 할인_행사;
import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
    	HashMap<String,Integer> hashMap = new HashMap<>();
    	for(int i = 0; i < want.length; i++) {
    		hashMap.put(want[i], number[i]);
    	}
//		System.out.println("====================");
//		for(int i = 0; i < want.length; i++) {
//			System.out.println(want[i] + " : " + hashMap.get(want[i]));
//		}
		
    	int counter = 0;
    	for(int i = 0; i < 10; i++) {
    		if(hashMap.containsKey(discount[i])) {
    			int temp = hashMap.get(discount[i]);
    			hashMap.replace(discount[i], temp - 1);
    		}
    	}
    	
    	boolean allZero = true;
    	for(int i = 0; i < want.length; i++) {
    		int temp = hashMap.get(want[i]);
    		if(temp != 0) {
    			allZero = false;
    			break;
    		}
    	}
    	if(allZero == true) {
    		counter ++;
    	}
    	
    	for(int t = 10; t < discount.length; t++) {
    		
//    		System.out.println("====================");
//    		for(int i = 0; i < want.length; i++) {
//    			System.out.println(want[i] + " : " + hashMap.get(want[i]));
//    		}
    		

    		if(hashMap.containsKey(discount[t - 10])) {
//        		System.out.println("discount["+t+"-10] :"+discount[t-10]);
    			int temp = hashMap.get(discount[t - 10]);
    			hashMap.replace(discount[t - 10], temp + 1);
    		}
    		if(hashMap.containsKey(discount[t])) {
    			int temp = hashMap.get(discount[t]);
    			hashMap.replace(discount[t], temp - 1);
    		}
    		
    		allZero = true;
        	for(int i = 0; i < want.length; i++) {
        		int temp = hashMap.get(want[i]);
        		if(temp != 0) {
        			allZero = false;
        			break;
        		}
        	}
        	if(allZero == true) {
        		counter ++;
        	}
    	}
    	
    	
    	
    	
    	return counter;
    }
}