package com.剑指_Offer.春招;

/**
 * <pre>
 *给定两个 01 字符串 a 和 b ，请计算它们的和，并以二进制字符串的形式输出。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/23 11:40
 */
public class 二进制加法 {
    public String addBinary(String a, String b) {
        /**
         * 局限性高：
         * 如果字符串超过33 位，不能转化为 Integer
         * 如果字符串超过65 位，不能转化为 Long
         *如果字符串超过 500000001 位，不能转化为 BigInteger
         */
//        return Integer.toBinaryString(
//                Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
//        );
        StringBuilder ans = new StringBuilder();

        int n = Math.max(a.length(), b.length());
        int carry = 0;
        for (int i = 0; i < n; i++){
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }
        if (carry > 0) ans.append(1);
        ans.reverse();
        return ans.toString();
    }
}
