package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/30 12:20
 */
public class 分发糖果 {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int answer = 0;
        int[] left = new int[len];
        for (int i = 0; i < len; i++) {
            if (i > 0 && ratings[i-1] < ratings[i]) {
                left[i] = left[i - 1] + 1;
            }else {
                left[i] = 1;
            }
        }
        int right = 0;
        for (int i = len - 1;i >= 0 ; i--){
            if (i < len - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            }else {
                right = 1;
            }
            answer += Math.max(right,left[i]);
        }
        return answer;
    }
}
