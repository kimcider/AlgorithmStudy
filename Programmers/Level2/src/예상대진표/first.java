package 예상대진표;
	
	class Solution
	{
	    public int solution(int n, int a, int b)
	    {
	        int answer = 1;
	        
	        if(a > b) {
	        	int temp = a;
	        	a = b;
	        	b = temp;
	        }
	        while(true) {
	        	if(( a + 1 == b) && (a % 2 == 1)) {
	        		break;
	        	}
	        	
	        	if(a % 2 == 1) {
	        		a = a + 1;
	        	}
	        	if(b % 2 == 1) {
	        		b = b + 1;
	        	}
	        	
	        	a = a / 2;
	        	b = b / 2;
	        	answer ++;
	        	
	        	
	        }
	        
	        return answer;
	    }
	}