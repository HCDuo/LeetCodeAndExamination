package com.剑指_Offer.春招;

/**
 * <pre>
 *给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 0 开始计数 ，
 * 所以答案数组应当满足 0 <= answer[0] < answer[1] < numbers.length 。
 * 假设数组中存在且只存在一对符合条件的数字，同时一个数字不能使用两次。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/25 10:14
 */
public class 排序数组中两个数字之和 {
    public int[] twoSum(int[] numbers, int target) {
        int low  = 0, high = numbers.length - 1;
        while (low < high) {
            if (numbers[low] + numbers[high] == target) return new int[]{low,high};
            if (numbers[low] + numbers[high] < target) low++;
            if (numbers[low] + numbers[high] > target) high--;
        }
        return new int[]{-1,-1};
    }
}
