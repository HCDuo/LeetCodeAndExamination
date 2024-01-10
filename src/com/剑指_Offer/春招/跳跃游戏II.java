package com.剑指_Offer.春招;

/**
 *<pre>
 *给定一个长度为 n 的 0 索引整数数组 nums。初始位置为 nums[0]。
 *每个元素 nums[i] 表示从索引 i 向前跳转的最大长度。换句话说，如果你在 nums[i] 处，你可以跳转到任意 nums[i + j] 处:
 *0 <= j <= nums[i] 
 *i + j < n
 *返回到达 nums[n - 1] 的最小跳跃次数。生成的测试用例可以到达 nums[n - 1]。
 *</pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/4/13 0:32
 */
public class 跳跃游戏II {
    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
