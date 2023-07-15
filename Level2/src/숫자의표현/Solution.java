package 숫자의표현;

class Solution {
    public int solution(int n) {
    	int answer = 1;
    	for(int i = 2; i < n; i++) {
    		float quotient = (float)n / (float)i;
    		float remainder = quotient - (int)quotient;
    		if((remainder == 0 && (i % 2 == 1)) || (remainder == 0.5 && (i % 2 == 0))) {
//    			System.out.println("i: "+ i +", remainder: " + remainder);
    			if(quotient - (i / 2) <= 0) {
//    				System.out.println("minvalue: "+ (quotient - (i/2)));
    				break;
    			}
    			answer ++;
    		}
    	}
    	
    	return answer;
    }
}

