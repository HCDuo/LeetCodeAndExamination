package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/3 23:17
 */
public class 轮转数组 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,k-1);
    }

    private void reverse(int[] nums, int start, int end) {
        int temp = 0;
        while (start <= end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
