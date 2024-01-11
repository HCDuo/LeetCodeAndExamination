package com.剑指_Offer.春招实习;

/**
 * <pre>
 *输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/17 14:26
 */
public class 调整数组顺序使奇数位于偶数前面 {
    public int[] exchange(int[] nums) {
        int leftp = 0, rightp = 0;
        while (leftp <= rightp && rightp < nums.length) {
            if (nums[rightp]%2==1){
                int temp = nums[leftp];
                nums[leftp] = nums[rightp];
                nums[rightp] = temp;
                leftp++;
                rightp++;
            }else {
                rightp ++;
            }
        }
        return nums;
    }
}
