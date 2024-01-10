package com.剑指_Offer.秋招.图的广度优先搜索;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/22 15:54
 */
public class 蛇梯棋 {
    public int snakesAndLadders(int[][] board) {
        int ans = 0;
        int n = board.length;
        boolean[] vis = new boolean[n * n + 1];
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{1, 0});
        while (!queue.isEmpty()) {
            int[] p = queue.poll();
            for (int i = 1; i <= 6; ++i){
                int nxt = p[0] + i;
                if (nxt > n * n) { // 超出边界
                    break;
                }
                int[] rc = id2rc(nxt, n); // 得到下一步的行列
                if (board[rc[0]][rc[1]] > 0) { // 存在蛇或梯子
                    nxt = board[rc[0]][rc[1]];
                }
                if (nxt == n * n) { // 到达终点
                    return p[1] + 1;
                }
                if (!vis[nxt]) {
                    vis[nxt] = true;
                    queue.offer(new int[]{nxt, p[1] + 1}); // 扩展新状态
                }
            }
        }
        return ans;
    }

    public int[] id2rc(int id, int n) {
        int r = (id - 1) / n, c = (id - 1) % n;
        if (r % 2 == 1) {
            c = n - 1 - c;
        }
        return new int[]{n - 1 - r, c};
    }
}
