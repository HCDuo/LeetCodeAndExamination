package com.剑指_Offer.秋招.哈希表;

import java.util.HashMap;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2024/1/8 14:14
 */
public class 存在重复元素II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (numsMap.containsKey(nums[i])){
                if (Math.abs(numsMap.get(nums[i])-i) <= k ){
                    return true;
                }else {
                    numsMap.put(nums[i],i);
                }
            }else {
                numsMap.put(nums[i], i);
            }
        }
        return false;
    }
}
