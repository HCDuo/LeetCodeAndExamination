package com.剑指_Offer.秋招.矩阵;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/16 21:05
 */
public class 有效的数独 {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][][] xy = new int[3][3][9];
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                char t = board[i][j];
                if (t != '.'){
                    int index = t- '0' - 1;
                    rows[i][index]++;
                    columns[j][index]++;
                    xy[i/3][j/3][index]++;
                    if (rows[i][index] > 1 || columns[j][index] > 1 || xy[i/3][j/3][index] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
