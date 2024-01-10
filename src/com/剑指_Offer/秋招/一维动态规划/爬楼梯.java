package com.剑指_Offer.秋招.一维动态规划;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/2 2:00
 */
public class 爬楼梯 {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return prev2;
    }

}
