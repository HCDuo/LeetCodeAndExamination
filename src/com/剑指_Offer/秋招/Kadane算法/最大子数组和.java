package com.剑指_Offer.秋招.Kadane算法;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/28 19:59
 */
public class 最大子数组和 {
    public int maxSubArray(int[] nums) {
        int ans = 0;
        int max = nums[0];
        for (int x: nums) {
            ans = Math.max(ans + x, x);
            max = Math.max(max, ans);
        }
        return max;
    }
}
