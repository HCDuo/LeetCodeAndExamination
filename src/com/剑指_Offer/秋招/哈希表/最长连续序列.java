package com.剑指_Offer.秋招.哈希表;

import java.util.Arrays;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @project Learning
 * @date 2024/1/15 16:15:52
 */
public class 最长连续序列 {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 去重并排序
        int[] sortedNums = Arrays.stream(nums).distinct().sorted().toArray();

        // 统计最长连续序列的长度
        int len = sortedNums.length;
        int maxLen = 1;
        int temp = 1;
        int start = 0;
        for (int i = 1; i < len; i++) {
            if (sortedNums[i] - sortedNums[i - 1] == 1) {
                temp = i - start + 1;
            } else {
                maxLen = Math.max(maxLen, temp);
                temp = 1;
                start = i;
            }
        }
        maxLen = Math.max(maxLen, temp);
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println(result); // 输出：4
    }
}
