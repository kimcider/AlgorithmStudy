package 피보나치_수;

class Solution {
    public int solution(int n) {
        int[] ary = new int[n + 1];
        ary[0] = 0;
        ary[1] = 1;
        for(int i = 2; i < n + 1; i++) {
        	ary[i] = (ary[ i - 1 ] + ary[ i - 2]) % 1234567;
        }
        
        
        return ary[n];
    }
}