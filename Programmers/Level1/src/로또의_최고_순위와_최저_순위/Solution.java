package 로또의_최고_순위와_최저_순위;
import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int fit = 0;
        int numZero = 0;
        for(int i = 0; i < 6; i++){
            if(lottos[i] != 0){
                for(int j = 0; j < 6; j++){
                    if(lottos[i] == win_nums[j]){
                        fit++;
                        break;
                    }
                }
            }else{
                numZero++;
            }
        }
        
        answer[0] = fit;
        answer[1] = fit + numZero;
        
        int order[] = new int[7];
        order[0] = 6;
        for(int i = 1; i < 7; i++){
            order[i] = 7 - i;
        }
        
        
        // System.out.println(Arrays.toString(order));
        return new int[]{order[answer[1]], order[answer[0]]};
    }
}