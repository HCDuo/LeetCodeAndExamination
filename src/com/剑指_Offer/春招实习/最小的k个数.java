package com.剑指_Offer.春招实习;

import java.util.Arrays;

/**
 * <pre>
 *输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/21 18:29
 */
public class 最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] temp = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
}
