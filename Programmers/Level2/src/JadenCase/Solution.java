package JadenCase;
//https://school.programmers.co.kr/learn/courses/30/lessons/12951#
class Solution {
    public String solution(String s) {
        char[] ary = s.toCharArray();
        
        boolean flag = true;
        for(int i = 0; i < ary.length; i++) {
        	if(ary[i] == ' ') {
        		flag = true;
        	}else {
        		if(flag == true) {
            		if(Character.isLowerCase(ary[i])) {
            			ary[i] = Character.toUpperCase(ary[i]);
            		}
            	}else {
            		ary[i] = Character.toLowerCase(ary[i]);
            	}
        		flag = false;
        	}	
        }      
        
        return String.copyValueOf(ary);
    }
}