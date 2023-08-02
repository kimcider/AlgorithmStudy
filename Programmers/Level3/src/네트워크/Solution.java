package 네트워크;

import java.util.Arrays;

class Solution {
	int[] ary;
	boolean[] visited;
	int length;
    public int solution(int n, int[][] computers) {
    	length = n;
        int answer = 0;
        
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
        	if(visited[i] == false) {
        		visited[i] = true;
        		dfs(i, computers);
        		answer++;
        	}
        }

        return answer;
    }
    
    
    public void dfs(int parent, int[][]computers) {
    	for(int i = 0 ; i < length; i++) {
    		if(i != parent && visited[i] == false && computers[i][parent] == 1) {
    			visited[i] = true;
    			dfs(i, computers);
    		}
    	}
    }
}