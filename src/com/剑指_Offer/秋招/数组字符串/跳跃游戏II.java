package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/15 15:35
 */
public class 跳跃游戏II {
    public int jump(int[] nums) {
        int len = nums.length;
        int pos = 0;
        int steps = 0;
        int end = 0;
        for (int i = 0; i < len - 1; i++) {
            pos = Math.max(pos,i + nums[i]);
            if (i == end){
                end = pos;
                steps++;
            }
        }
        return steps;
    }
}
