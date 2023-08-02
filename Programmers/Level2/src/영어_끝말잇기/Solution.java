package 영어_끝말잇기;
import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        boolean flag = true;
        HashSet<String> set = new HashSet<>();
        char lastChar;
        lastChar = words[0].charAt(words[0].length() - 1);
        set.add(words[0]);
        
        int player = 2;
        int round = 1;
        
        for(int i = 1; i < words.length; i++) {
        	if((words[i].charAt(0) != lastChar) || set.contains(words[i])) {
        		flag = false;
        		break;
        	}
        	set.add(words[i]);
            lastChar = words[i].charAt(words[i].length() - 1);
            
            if(player == n) {
            	player = 0;
            	round ++;
            }
            player++;
        }
        
        if(flag == true) return new int[]{0, 0};
        else return new int[] {player, round};
    }
}