package 점프와_순간_이동;

class sol1 {
    public int solution(int n) {
    	
    	int answer = 0;
    	
    	while(n >= 1) {
    		while(n % 2 == 0) {
    			System.out.println("n: " + n+ ", answer: "+answer);
    			n = n / 2;
    		}
    		n --;
    		answer ++;
    	}
    	
        return answer;
    }
}