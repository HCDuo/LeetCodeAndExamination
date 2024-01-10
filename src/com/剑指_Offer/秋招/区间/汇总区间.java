package com.剑指_Offer.秋招.区间;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/16 22:06
 */
public class 汇总区间 {
    public List<String> summaryRanges(int[] nums) {
        List<String> results = new ArrayList<String>();
        if (nums.length == 0) {
            return results; // 返回空列表，因为数组为空
        }
        String chars = "->";
        int left = nums[0];
        int right = nums[0];
        int i;
        for(i = 1;i<nums.length;i++) {
            int temp = nums[i-1];
            right = nums[i];
            if (right == temp+1){
                continue;
            } else if (left == temp){
                results.add(Integer.toString(left));
                left = right;
            }
            else {
                String str1 = Integer.toString(left);
                String str2 = Integer.toString(temp);
                String str3 = str1 + chars + str2;
                results.add(str3);
                left = right;
            }
        }

        if (left == right) {
            results.add(Integer.toString(left));
        } else {
            results.add(left + "->" + right);
        }
        return results;
    }
}
