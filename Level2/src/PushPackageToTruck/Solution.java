package PushPackageToTruck;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/131704
 */

/*
 * 스택을 사용해 영재의 공장시스템과 동일하게 구현 
 */

import java.util.Stack;
public class Solution {
    public int solution(int[] order) {
    	int answer = 0;
    	int number = order.length;
    	
    	Stack<Integer> stack = new Stack<>();
    	
    	int outNumber = 1;
    	int index = 0;
    	while(true) {
    		if(index >= number) break;
    		
    		if(outNumber == order[index]) {
    			answer ++;
    			outNumber ++;
    			index ++;
    			continue;
    		}
    		
    		if(stack.isEmpty() == false) {
    			if(stack.peek() == order[index]) {
        			answer ++;
        			stack.pop();
        			index ++;
        			continue;
        		}
    			if(stack.peek() > order[index]) {
        			break;
        		}
    		}
    		
    		stack.push(outNumber);
    		outNumber++;
    	}
    	
    	
    	return answer;
    }
}
