package com.剑指_Offer.春招实习;

/**
 * <pre>
 *给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/4/13 10:46
 */
public class 岛屿数量 {
    public void DFS(char[][] grid,int x,int y){
        int gx = grid.length;
        int gy = grid[0].length;
        if (x >= gx || y >= gy || x < 0 || y < 0 || grid[x][y] == '0') return;
        grid[x][y] = '0';
        DFS(grid,x + 1,y);
        DFS(grid,x,y + 1);
        DFS(grid,x - 1,y);
        DFS(grid,x,y - 1);
    }
    public int numIslands(char[][] grid) {
        int island = 0;
        int x = grid.length;
        int y = grid[0].length;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == '1'){
                    island++;
                    DFS(grid,i,j);
                }
            }
        }
        return island;
    }
}
