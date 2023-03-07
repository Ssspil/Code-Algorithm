import java.util.*;

class Solution {
    public int solution(int[][] board) {
    
        int boardClone[][] = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){ // 반복문 + ArrayCopy
            System.arraycopy(board[i], 0, boardClone[i], 0, boardClone[0].length);
        }
        int row = board.length;
        int col = board[0].length;
        int count = 0;
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(board[i][j] == 1){
                    nonSafeZon(i, j, row, col, boardClone);
                }
            }
        }
        
        
        for(int k = 0; k < row; k++){
            for(int p = 0; p < col; p++){
                if(boardClone[k][p] == 0){
                    count++;
                }
            }
        }
        return count;
        
    }
    
    // 3 2 5 5 
    public static void nonSafeZon(int i, int j, int row, int col, int[][]boardClone){
        
        for(int i2 = i-1; i2 <= i+1; i2++ ){    // 2 3 4
            if(i2 < 0 || i2 > row-1){
                continue;
            }
            for(int j2 = j-1; j2 <= j+1; j2++){ // 1 2 3
                if(j2 < 0 || j2 > col-1){
                    continue;
                }
                boardClone[i2][j2] = 1;
            }
        }
        
    }
    
}
