package com.剑指_Offer.春招;

import java.util.HashMap;

/**
 * <pre>
 *给定一个整数数组和一个整数 k ，请找到该数组中和为 k 的连续子数组的个数。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/26 11:55
 */
public class 和为k的子数组 {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int pre = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0;i < nums.length ;i++) {
            pre += nums[i];
            if (map.containsKey(pre - k)){
                ans += map.get(pre - k);
            }
            map.put(pre,map.getOrDefault(pre,0) + 1);
        }
        return ans;
    }
}
