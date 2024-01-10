package com.剑指_Offer.春招;

/**
 * <pre>
 *在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。
 * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。
 * 给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
 *
 */
public class 礼物的最大价值 {
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] price = new int[grid.length][grid[0].length];
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n ;j++ ){
                if (i > 0) {
                    price[i][j] = Math.max(price[i][j],price[i - 1][j]);
                }
                if (j > 0) {
                    price[i][j] = Math.max(price[i][j],price[i][j - 1]);
                }
                price[i][j] += grid[i][j];
            }
        }
        return price[m-1][n-1];
    }
}
