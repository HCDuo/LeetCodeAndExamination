package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/5 1:22
 */
public class 跳跃游戏 {
    public boolean canJump(int[] nums) {
        int len = nums.length-1;
        int max = 0;
        for (int i = 0; i <= len; i++) {
            if (i <= max) {
                max = Math.max(max,i + nums[i]);
            }
            if (max >= len) {
                return true;
            }
        }
        return false;
    }
}
