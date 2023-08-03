package 다리를_지나는_트럭;

import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int n = truck_weights.length;
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        int sec = 0;
        int totWeight = 0;
        int index = 0;
        while(index < n){
            sec++;
            int target = truck_weights[index];
            // System.out.println("target: " + target +", sec: "+sec);
            int size = queue.size();
            if(queue.isEmpty()){
                queue.add(target);
                totWeight+=target;
                index++;
            }else{
                if(size == bridge_length){
                    totWeight -= queue.poll();
                }
                
                if(totWeight + target <= weight){
                    // System.out.println("in!!");
                    queue.add(target);
                    index++;
                    totWeight+=target;
                }else{
                    queue.add(0);
                }
            }
        }
        // System.out.println("sec: " + sec);
        sec+=bridge_length;
        return sec;
    }
}