package 다음_큰_숫자;

import java.util.Arrays;

class Solution {
    public int solution(int n) {
    	int answer = 0;
    	String binary = Integer.toBinaryString(n);
    	char[] ary = binary.toCharArray();
    	
    	boolean flag = false;
    	int fillToOneIndex = 0;
    	int oneCounter = 0;
    	for(int i = ary.length - 1; i >= 0; i--) {
    		if(ary[i] == '1') {
    			flag = true;
    		}
    		
    		if(flag == true) {
    			if(ary[i] == '0') {
    				flag = false;
    				fillToOneIndex = i;
    				break;
    			}
    			oneCounter = oneCounter + 1;
    		}
    	}
    	
    	int exponent = 1;
    	for(int i = ary.length - 1; i > fillToOneIndex; i--) {
			if(oneCounter > 1) {
				answer = answer + exponent;
				oneCounter = oneCounter - 1;
			}
			exponent = exponent * 2;
		}
		answer = answer + exponent;
		
		for(int i = fillToOneIndex; i >= 0; i--) {
			if(ary[i] == '1') {
				answer = answer + exponent;
			}
			exponent = exponent * 2;
		}
		
    	return answer;
    }
}