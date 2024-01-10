package 笔试;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/11/3 19:28
 */
public class YueWen {
    public static int findLongestSubArray(ArrayList<Integer> nums) {
//        int n = nums.size();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = nums.get(i);
//        }
//        int[] maxPos = new int[n];
//        int[] minNeg = new int[n];
//        maxPos[0] = array[0] > 0 ? 1:0;
//        minNeg[0] = array[0] <= 0 ? 1:0;
//        int longest = maxPos[0];
//        for (int i = 1; i < n; i++) {
//            if (array[i] > 0){
//                if (maxPos[i - 1] > 0){
//                    maxPos[i] = maxPos[i - 1] + 1;
//                }
//                if (minNeg[i - 1] < 0){
//                    minNeg[i] = minNeg[i - 1] + 1;
//                }
//            } else if (array[i] < 0) {
//                if (minNeg[i - 1] < 0){
//                    maxPos[i] = minNeg[i - 1] + 1;
//                }
//                if (maxPos[i - 1] > 0){
//                    minNeg[i] = maxPos[i - 1] + 1;
//                }
//            }else {
//                maxPos[i] = 0;
//                minNeg[i] = 0;
//            }
//            longest = Math.max(longest,maxPos[i]);
//        }
//        return longest;

//        int max = 0;
//        int left = 0;
//        int right = 1;
//        while (left <= right && left < nums.size() && right < nums.size()) {
//            if (nums.get(right) <= 0) {
//                max = Math.max(right - left,max);
//                left++;
//                right = left + 1;
//            }else {
//                right++;
//            }
//        }
//        return max;

        int n = nums.size();
        if (n == 0){
            return 0;
        }
        int maxPos = 0;
        int maxOvers = 0;
        for (int i = 0; i < n;i++){
            if (nums.get(i) > 0){
                if (i > 0 && maxPos > 0){
                    maxPos += 1;
                }else {
                    maxPos = 1;
                }
            }else if (nums.get(i) < 0){
                if (i > 0 && maxPos > 0){
                    maxPos += 1;
                }else {
                    maxPos = 0;
                }
            }else {
                maxPos = 0;
            }
            maxOvers = Math.max(maxPos,maxOvers);
        }
        return maxOvers;
    }


    public static Boolean palindromeNumber(int number) {
        int a = number/10000;
        int b = number%10000 / 1000;
        int c = number%1000 / 100;
        int d = number%100 / 10;
        int e = number%10;
        return a==e && b == d;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(-1);
        nums.add(4);
        System.out.println(findLongestSubArray(nums));

        int num = 18182;
        System.out.println(palindromeNumber(num));
    }
}
