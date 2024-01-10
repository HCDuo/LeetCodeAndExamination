package com.剑指_Offer.秋招.双指针;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/10/16 22:08
 */
public class 两数之和II输入有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target){
                break;
            }else if (numbers[left] + numbers[right] < target){
                left++;
            }else {
                right--;
            }
        }
        int[] newR = new int[2];
        newR[0] = left+1;
        newR[1] = right+1;
        return newR;
    }
}
