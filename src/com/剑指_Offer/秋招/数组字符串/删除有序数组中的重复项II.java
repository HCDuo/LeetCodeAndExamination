package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/2 14:49
 */
public class 删除有序数组中的重复项II {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int pt = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[pt]){
                nums[pt + 1] = nums[i];
                pt++;
                k++;
                count = 1;
            }else {
                if (count != 1) {
                    continue;
                }else {
                    nums[pt + 1] = nums[i];
                    pt++;
                    k++;
                    count = 2;
                }
            }
        }
        return k;
    }
}
