package RightParen;
//https://school.programmers.co.kr/learn/courses/30/lessons/12909

class Solution {
    boolean solution(String s) {
        int counter = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '(') {
        		counter ++;
        	}else {
        		counter --;
        	}
        	if(counter < 0) {
        		return false;
        	}
        }
        if(counter == 0) {
        	return true;
        }
        else return false;
    }
}