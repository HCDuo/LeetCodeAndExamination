package com.剑指_Offer.春招实习;

import java.util.stream.IntStream;

/**
 * <pre>
 *给你一个整数数组 nums ，请计算数组的 中心下标 。
 * 数组中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
 * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/26 14:02
 */
public class 左右两边子数组的和相等 {
    public int pivotIndex(int[] nums) {
        // get stream of elements
        IntStream stream = IntStream.of(nums);
        // add the elements in stream
        int sum = stream.sum();
        int sumleft = 0,sumright = 0;
        for (int i = 0; i < nums.length; i++) {
            sumright = sum - sumleft - nums[i];
            if (sumleft == sumright) return i;
            sumleft += nums[i];
        }
        return -1;
    }
}
