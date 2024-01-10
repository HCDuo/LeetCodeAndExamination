package com.剑指_Offer.秋招.滑动窗口;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/13 14:06
 */
public class 长度最小的子数组 {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;    // 数组长度
        int minLen = n + 1;     // 最小子数组长度，初始为一个比原数组还长的值
        int left = 0;           // 滑动窗口左边界
        int right = 0;          // 滑动窗口右边界，指向下一个要加入滑动窗口的值
        int subArrSum = 0;      // 当前滑动窗口[left, right)维护的子数组的元素和
        while(left < n){
            if(subArrSum < target){
                // 元素和小于目标值，需要加入更多元素增大元素和
                if(right == n){
                    break;  // 右边界已经到达边界，无法加入更多元素，退出
                }
                subArrSum += nums[right++];     // 元素和累加当前右边界的值，右边界再右移
            }else{
                // 元素和大于等于目标值，找到一个满足条件的子数组
                minLen = Math.min(minLen, right - left);    // 更新子数组最小长度
                subArrSum -= nums[left++];      // 剔除左边界元素，尝试缩小子数组长度以找到长度更小的子数组
            }
        }
        return minLen == n + 1 ? 0 : minLen;    // 如果minLen仍为初始值，说明没有找到满足条件的子数组，返回0；否则返回minLen
    }
}
