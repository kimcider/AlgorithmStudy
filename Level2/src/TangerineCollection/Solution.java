package TangerineCollection;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/138476
 */


/*
 * 종류별로 count해서 위부터 채우기. 
 * 
 * 1. 종류별로 카운트해야하고
 * 2. 이들을 정렬해야한다. 
 * 
 */
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] size = new int[10000001];
        for(int i = 0; i < tangerine.length; i++) {
        	size[tangerine[i]]++;
        }
//        
//        Arrays.sort(size,new Comparator<int>() {
//        	public int compare(int a, int b) {
//        		return Integer.compare(b, a);
//        	}
//        });
//        for(int i = 0; i < size.length; i++) {
//        	if(size[i] != 0) {
//        		System.out.print(size[i]);
//        	}else break;
//        }
//        
        
        return answer;
    }
}