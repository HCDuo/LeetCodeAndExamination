package com.剑指_Offer.秋招.矩阵;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/11/17 14:02
 */
public class 螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int row = matrix.length;
        int col = matrix[0].length;
        int u = 0, d = row - 1, l = 0, r = col - 1;
        while (true){
            for (int i = l; i <= r ; i++) result.add(matrix[u][i]);
            if(++u > d) break;
            for (int i = u; i <= d ; i++) result.add(matrix[i][r]);
            if(--r < l) break;
            for (int i = r; i >= l ; i--) result.add(matrix[d][i]);
            if(--d < u) break;
            for (int i = d; i >= u ; i--) result.add(matrix[i][l]);
            if(++l > r) break;
        }
        return result;
    }
}
