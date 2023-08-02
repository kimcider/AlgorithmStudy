package MaxAndMinValue;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strings = s.split(" ");
        
        int maxVal = Integer.valueOf(strings[0]);
        int minVal = Integer.valueOf(strings[0]);
        for(int i = 1; i < strings.length; i++) {
        	int val = Integer.valueOf(strings[i]);
        	if(maxVal < val) maxVal = val;
        	if(minVal > val) minVal = val;
        }
        
        answer = answer + minVal;
        answer = answer + " ";
        answer = answer + maxVal;
        return answer;
    }
}