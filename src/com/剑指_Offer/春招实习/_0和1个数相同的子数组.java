package com.剑指_Offer.春招实习;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/26 13:39
 */
public class _0和1个数相同的子数组 {
//  前缀和 + 哈希
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        map.put(count, -1);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num == 1) {
                count++;
            } else {
                count--;
            }
            if (map.containsKey(count)) {
                int prevIndex = map.get(count);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                map.put(count, i);
            }
        }
        return maxLength;
    }
}
