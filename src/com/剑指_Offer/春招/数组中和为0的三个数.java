package com.剑指_Offer.春招;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 *给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
 *同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
 *注意：答案中不可以包含重复的三元组。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/25 10:19
 */
public class 数组中和为0的三个数 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for (int first = 0; first < n; ++first) { // 枚举 a
            if (first > 0 && nums[first] == nums[first - 1]) {// 需要和上一次枚举的数不相同
                continue;
            }
            int third = n - 1;// c 对应的指针初始指向数组的最右端
            int target = -nums[first];
            for (int second = first + 1; second < n; ++second) {// 枚举 b
                if (second > first + 1 && nums[second] == nums[second - 1]) {// 需要和上一次枚举的数不相同
                    continue;
                }
                while (second < third && nums[second] + nums[third] > target) {// 需要保证 b 的指针在 c 的指针的左侧
                    --third;
                }
                if (second == third) {// 如果指针重合，随着 b 后续的增加就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}
