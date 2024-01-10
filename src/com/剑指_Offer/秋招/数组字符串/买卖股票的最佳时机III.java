package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/10/2 12:21
 */
public class 买卖股票的最佳时机III {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][4];
        dp[0][0] = prices[0];
        dp[0][1] = 0;
        dp[0][2] = prices[0];
        dp[0][3] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],-prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],prices[i] + dp[i][0]);
            dp[i][2] = Math.max(dp[i-1][2],dp[i][1] - prices[i]);
            dp[i][3] = Math.max(dp[i-1][3],prices[i] + dp[i][2]);
        }
        return dp[prices.length-1][3];
    }
}
