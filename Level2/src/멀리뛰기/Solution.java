package 멀리뛰기;

class Solution {
	
    public long solution(int n) {
    	long[] ary = new long[n + 1];
    	ary[0] = 1;
    	ary[1] = 1;
    	
    	for(int i = 2; i <= n; i++) {
    		ary[i] = ary[i - 1] + ary[i - 2];
    		ary[i] = ary[i] % 1234567;
    	}
    	
    	
    	
    	
    	return ary[n] % 1234567;
    }
}