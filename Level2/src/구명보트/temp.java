package 구명보트;

import java.util.Vector;
import java.util.Arrays;
class temp {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int l = 0;
        int r = people.length - 1;
        
        while(l <= r) {
        	if(people[l] + people[r] > limit) {
        		answer ++;
        		r --;
        	}else {
        		answer ++;
        		r --;
        		l --;
        	}
        }
        return answer;
    }
}