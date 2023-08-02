package 타겟_넘버;

class Solution {
	
	int answer = 0;
	int length = 0;
    public int solution(int[] numbers, int target) {
    	length = numbers.length;
        methodPlus(numbers, 0, 0, target);
        methodMinus(numbers, 0, 0, target);
        
        return answer;
    }
    
    public void methodPlus(int[] numbers, int index, int current, int target) {
    	current = current + numbers[index];
    	index = index + 1;
    	
    	if(index == length) {
    		System.out.println("current: " + current);
    		if(target == current) {
    			answer = answer + 1;
    		}
    	}else {
    		methodPlus(numbers, index, current, target);
    		methodMinus(numbers, index, current, target);
    	}
    }
    public void methodMinus(int[] numbers, int index, int current, int target) {
    	current = current - numbers[index];
    	index = index + 1;
    	
    	if(index == length) {
    		System.out.println("current: " + current);
    		if(target == current) {
    			answer = answer + 1;
    		}
    	}else {
    		methodPlus(numbers, index, current, target);
    		methodMinus(numbers, index, current, target);
    	}
    }
}