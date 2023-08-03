package 행렬_테두리_회전하기;
import java.util.*;
class Solution {
    int[][] matrix;
    int row;
    int col;
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        row = rows;
        col = columns;
        matrix = new int[row][col];
        int num = 1;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = num++;
            }
        }
        for(int i = 0; i < queries.length; i++){
            answer[i] = rotate(queries[i]);
        }
        return answer;
    }
    public void checkMatrix(){
        for(int i = 0 ; i < row; i++){
           System.out.println(Arrays.toString(matrix[i]));
        }
    }
    
    public int rotate(int[]query){
        int min = 100000;
        int y1 = query[0] - 1;
        int x1 = query[1] - 1;
        int y2 = query[2] - 1;
        int x2 = query[3] - 1;
        
        int before = -99;
        int start = matrix[y1][x2];
        System.out.println(start);
        min = start;
        for(int i = x2; i > x1; i--){
            matrix[y1][i] = matrix[y1][i - 1];
            if(min > matrix[y1][i]){
                min = matrix[y1][i];
            }
        }
        for(int i = y1; i < y2; i++){
            matrix[i][x1] = matrix[i+1][x1];
            if(min > matrix[i][x1]){
                min = matrix[i][x1];
            }
        }
        for(int i = x1; i < x2; i++){
            matrix[y2][i] = matrix[y2][i+1];
            if(min > matrix[y2][i]){
                min = matrix[y2][i];
            }
        }
        for(int i = y2; i > y1; i--){
            matrix[i][x2] = matrix[i - 1][x2];
            if(min > matrix[i][x2]){
                min = matrix[i][x2];
            }
        }
        matrix[y1 + 1][x2] = start;
        return min;
    }
}