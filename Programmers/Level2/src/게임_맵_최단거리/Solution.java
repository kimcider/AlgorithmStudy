package 게임_맵_최단거리;

import java.util.Arrays;
import java.util.*;

class Solution {
	boolean visited[][];
	int maxX;
	int maxY;
	int maxVal = 9999999;
	int answer = maxVal;

    public int solution(int[][] maps) {
    
        maxY = maps.length;
        maxX = maps[0].length;
        
        for(int i = 0; i < maxY; i++) {
        	for(int j = 0; j < maxX; j++) {
        		if(maps[i][j] == 1) maps[i][j] = maxVal;
        	}
        }
        
        visited = new boolean[maxY][maxX];
        
        Queue<int[]> queue = new LinkedList<>();
        int[] first = new int[3];
        first[0] = maxY - 1; first[1] = maxX - 1; first[2] = 1;
        // visited[maxY - 1][maxX - 1] = true;
        queue.add(first);
        while(!queue.isEmpty()) {
        	int[] temp = queue.poll();
        	if(visited[temp[0]][temp[1]] == true) continue;
        	visited[temp[0]][temp[1]] = true;
        	maps[temp[0]][temp[1]] = temp[2];
        	// 동
        	if(temp[1] + 1 < maxX && maps[temp[0]][temp[1] + 1] != 0 && visited[temp[0]][temp[1] + 1] == false) {
        		if(maps[temp[0]][temp[1] + 1] != 0 && visited[temp[0]][temp[1] + 1] == false) {
        			queue.add(new int[] {temp[0], temp[1] + 1, temp[2] + 1});
        		}
        	}
        	//서 
        	if(temp[1] - 1 >= 0 && maps[temp[0]][temp[1] - 1] != 0 && visited[temp[0]][temp[1] - 1] == false) {
        		if(maps[temp[0]][temp[1] - 1] != 0 && visited[temp[0]][temp[1] - 1] == false) {
        			queue.add(new int[] {temp[0], temp[1] - 1, temp[2] + 1});
        		}
        	}
        	//남
        	if(temp[0] + 1 < maxY && maps[temp[0] + 1][temp[1]] != 0 && visited[temp[0] + 1][temp[1]] == false) {
        		if(maps[temp[0] + 1][temp[1]] != 0 && visited[temp[0] + 1][temp[1]] == false) {
        			queue.add(new int[] {temp[0] + 1, temp[1], temp[2] + 1});
        		}
        	}
        	//북
        	if(temp[0] - 1 >= 0 && maps[temp[0] - 1][temp[1]] != 0 && visited[temp[0] - 1][temp[1]] == false) {
        		if(maps[temp[0] - 1][temp[1]] != 0 && visited[temp[0] - 1][temp[1]] == false) {
        			queue.add(new int[] {temp[0] - 1, temp[1], temp[2] + 1});
        		}
        	}
        }
        
        // for(int i = 0; i < maxY; i++) {
        // 	System.out.println(Arrays.toString(maps[i]));
        // }
        
        if(maps[0][0] == maxVal) return -1;
        else return maps[0][0];
    }
}