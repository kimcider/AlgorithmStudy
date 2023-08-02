package 단어_변환;


import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        boolean visited[] = new boolean[words.length];
        
        Queue<String> queue = new LinkedList<String>();
        Queue<Integer> index_queue = new LinkedList<Integer>();
        Queue<Integer> length_queue = new LinkedList<Integer>();
        queue.add(begin);
        index_queue.add(-1);
        length_queue.add(1);
        
        while(queue.isEmpty() == false) {
        	String temp = queue.poll();
//        	System.out.println(temp);
        	int index = index_queue.poll();
        	int length = length_queue.poll();

        	if(index != -1) {
            	if(visited[index] == true)continue;
        		visited[index] = true;
        	}
        	
        	for(int i = 0; i < words.length; i++) {
        		if(visited[i] == false) {
        			if(distance(temp, words[i]) == 1) {
        				if(words[i].equals(target)) return length;
        				queue.add(words[i]);
        				index_queue.add(i);
        				length_queue.add(length + 1);
        			}
        		}
        	}
        }
        
        
        
        return answer;
    }
    
    public int distance(String begin, String target) {
    	int counter = 0;
    	for(int i = 0; i < begin.length(); i++) {
    		if(begin.charAt(i) != target.charAt(i)) {
    			counter++;
    		}
    	}
    	return counter;
    }
}