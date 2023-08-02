package 카펫;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        for(int i = 1; i <= yellow; i++) {
        	if((yellow % i) == 0) {
        		
        		int col = i;
        		int row = yellow / i;
        		
        		if(((row + col) * 2) + 4 == brown) {
        			return new int[] {row + 2,col + 2};
        		}
        	}
        }
        return answer;
    }
}