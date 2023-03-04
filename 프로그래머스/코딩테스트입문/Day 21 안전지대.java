import java.util.Arrays;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        int boomExplosionRange = 1;

        int[][] copyBoard = new int[board.length][board[0].length];

        int tempIndex = 0;
        for (int[] rows : board) {
            copyBoard[tempIndex] = Arrays.copyOf(rows, board[tempIndex].length);
            tempIndex++;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int val = board[i][j];
                if(val == 0) continue;

                makeBoomArea(i, j, boomExplosionRange,copyBoard);
            }
        }

        for (int[] ints : copyBoard) {
            for (int anInt : ints) {
                if(anInt == 0)
                    answer++;
            }
        }

        return answer;
    }

    private void makeBoomArea(int row, int col, int boomExplosionRange, int[][] board) {
        for (int r = row - boomExplosionRange; r <= row + boomExplosionRange ; r++) {
            if(r < 0 || r >= board.length) continue;

            for (int c = col - boomExplosionRange; c <= col + boomExplosionRange; c++) {
                if(c < 0 || c >= board[0].length) continue;

                board[r][c] = 1;
            }
        }
    }
}
