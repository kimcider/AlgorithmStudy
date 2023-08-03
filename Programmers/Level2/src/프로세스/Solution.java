package 프로세스;

import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int priority[] = new int[10];
        Queue<Integer> queue = new LinkedList<Integer>();
        
        int top = 0;
        for(int i = 0; i < priorities.length; i++){
            queue.add(priorities[i]);
            priority[priorities[i]]++;    
            if(priorities[i] > top ) top = priorities[i];
        }
        
        // System.out.println(Arrays.toString(priority));
        // System.out.println("top: " + top + ", queue.size: " + queue.size());
        
        while(queue.isEmpty()==false){
            int num = queue.poll();
            // System.out.println("num: " + num + ", location: " + location + ", size: " + queue.size());
            if(num == top){
                answer++;
                if(location == 0){
                    break;
                }
                
                location--;
                priority[num]--;
                if(priority[num] == 0){
                    for(int i = num - 1; i >= 1; i--){
                        if(priority[i] != 0){
                            top = i;
                            break;
                        }
                    }
                }
            }else{
                queue.add(num);
                if(location == 0){
                    location = queue.size() - 1;
                }else{
                    location--;
                }
            }
        }
        
        return answer;
    }
}