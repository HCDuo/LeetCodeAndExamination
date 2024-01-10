package com.剑指_Offer.秋招.图;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/22 15:22
 */
public class 岛屿数量 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1'){
                    ans++;
                    DFS(grid,i,j);
                }
            }
        }
        return ans;
    }

    public void DFS(char[][] grid,int r,int c) {
        if (!inArea(grid,r,c) || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        DFS(grid,r+1,c);
        DFS(grid,r-1,c);
        DFS(grid,r,c+1);
        DFS(grid,r,c-1);

    }

    public boolean inArea(char[][] grid,int r,int c){
        return 0 <= r && r < grid.length
                && 0 <= c && c < grid[0].length;
    }
}
