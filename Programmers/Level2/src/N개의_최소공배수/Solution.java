package N개의_최소공배수;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
        	int temp = 1;
        	for(int j = arr[i]; j >= 2; j --) {
        		if(answer % j == 0 && arr[i] % j == 0) {
        			System.out.println("answer("+answer+") and arr["+i+"]("+arr[i]+") is divided by "+j);
        			arr[i] = arr[i] / j;
        			answer = answer / j;
        			temp = temp * j;
        		}
        	}
        	answer = answer * arr[i] * temp;
        	
        	System.out.println("answer: "+answer);
        }
        
        
        return answer;
    }
}