package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/30 14:00
 */
public class 接雨水 {

    public static int trap(int[] height) {
        int ans = 0;
        int len = height.length;
        int[] maxLeft = new int[len];
        maxLeft[0] = height[0];
        int[] maxRight = new int[len];
        maxRight[len-1] = height[len-1];
        for (int i = 1; i < len; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1],height[i]);
        }
        for (int i = len - 2; i > 0; i--) {
            maxRight[i] = Math.max(maxRight[i+1],height[i]);
        }
        for (int i = 0; i < len; i++) {
            ans += Math.min(maxRight[i],maxLeft[i]) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
