package 괄호_회전하기;

import java.util.*;

class Solution {
    public int solution(String s) {
    	if(s.length() % 2 == 1) return 0;
        int answer = 0;
        for(int t = 0; t < s.length(); t++) {
        	char temp = s.charAt(0);
        	s = s.substring(1, s.length());
        	s += Character.toString(temp); 

        	Stack<Character> stack = new Stack<>();
        	boolean valid = true;
        	for(int i = 0; i < s.length(); i++) {
        		if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
        			stack.push(s.charAt(i));
        		}else {
        			if(stack.isEmpty()) {
        				valid = false;
        				break;
        			}
        			temp = stack.pop();
        			if((s.charAt(i) == '}' && temp == '{' ) || (s.charAt(i) == ']' && temp == '[') || (s.charAt(i) == ')' && temp == '(')) {
        				
        			}else {
        				valid = false;
        				break;
        			}
        		}
        	}
        	
        	if(valid == true) {
        		answer ++;
        	}
        }
        return answer;
    }
}