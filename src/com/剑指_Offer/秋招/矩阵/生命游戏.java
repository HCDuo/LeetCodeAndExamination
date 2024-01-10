package com.剑指_Offer.秋招.矩阵;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/12/22 13:35
 */
public class 生命游戏 {
    public void gameOfLife(int[][] board) {
        int[] neighbors = {-1,0,1};
        int rows = board.length;
        int cols = board[0].length;
        int[][] copyBoard = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                copyBoard[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int mapLives = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (!(neighbors[k] == 0 && neighbors[l] == 0)) {
                            int row = neighbors[k] + i;
                            int col = neighbors[l] + j;
                            if ((row < rows && row >= 0) && (col < cols && col >= 0) && (copyBoard[row][col] == 1)) {
                                mapLives += 1;
                            }
                        }
                    }
                }
                if ((board[i][j] == 1 && mapLives < 2) || (board[i][j] == 1 && mapLives > 3)){
                    board[i][j] = 0;
                }
                if ((board[i][j] == 1 && (mapLives == 2 || mapLives == 3 )) || (board[i][j] == 0 && mapLives == 3)){
                    board[i][j]  = 1;
                }
            }
        }
    }
}
