package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/13 13:55
 */
public class 移除元素 {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val){
                nums[left] = nums[right - 1];
                right--;
            }else {
                left++;
            }
        }
        return left;
    }
}
