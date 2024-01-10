package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/3 23:22
 */
public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i  = 0; i < prices.length; i++){
            if (prices[i] < min) {
                min = prices[i];
            }
            else if (prices[i] - min > ans){
                ans = prices[i] - min;
            }
        }
        return ans;
    }
}
