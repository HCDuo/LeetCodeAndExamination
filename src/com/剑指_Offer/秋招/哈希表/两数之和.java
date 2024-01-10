package com.剑指_Offer.秋招.哈希表;

import java.util.HashMap;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2024/1/8 13:58
 */
public class 两数之和 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (numsMap.containsKey(target - nums[i])){
                return new int[]{numsMap.get( target - nums[i]), i};
            }
            numsMap.put(nums[i],i);
        }
        return new int[0];
    }
}
