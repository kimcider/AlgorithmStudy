package InfiniteBinaryTranslator;
//https://school.programmers.co.kr/learn/courses/30/lessons/70129

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int repeatCounter = 0;
        int erasedZero = 0;
        
        while(true) {
        	repeatCounter++;
        	int oneCounter = 0;
        	for(int i = 0; i < s.length(); i++) {
        		if(s.charAt(i) == '1') {
        			oneCounter ++;
        		}else {
        			erasedZero++;
        		}
        	}
        	
        	s = Integer.toBinaryString(oneCounter);
        	if(s.equals("1")) {
        		answer[0] = repeatCounter;
        		answer[1] = erasedZero;
        		break;
        	}else {
//        		repeatCounter++;
        	}
        }
        
        return answer;
    }
}