package com.剑指_Offer.秋招.多维动态规划;

import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/2 14:20
 */
public class 三角形最小路径和 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        for (int i = n - 2; i >= 0; i--){
            List<Integer> current = triangle.get(i);
            List<Integer> next = triangle.get(i + 1);
            for (int j = 0; j < current.size(); j++) {
                int min = Math.min(next.get(j),next.get(j + 1));
                current.set(j , current.get(j) +  min);
            }
        }
        return triangle.get(0).get(0);
    }
}
