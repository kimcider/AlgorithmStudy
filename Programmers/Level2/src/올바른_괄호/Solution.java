package 올바른_괄호;
import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int n = s.length();
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            char temp = s.charAt(i);
            if(temp == '('){
                stack.push(temp);
            }else{
                if(stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        
        if(stack.isEmpty()) return true;
        else return false;
    }
}