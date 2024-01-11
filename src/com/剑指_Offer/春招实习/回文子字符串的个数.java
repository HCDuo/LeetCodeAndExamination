package com.剑指_Offer.春招实习;

/**
 * <pre>
 *给定一个字符串 s ，请计算这个字符串中有多少个回文子字符串。
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/28 17:54
 */
public class 回文子字符串的个数 {
    //动态规划，判断 j 和 i 两个字符是否相等
    public int countSubstrings(String s) {
        int len = s.length();
        boolean[][] bos = new boolean[len][len];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                boolean t = s.charAt(i) == s.charAt(j);
                if ((i - j) <= 2) {
                    bos[j][i] = t;
                } else {
                    bos[j][i] = t && bos[j + 1][i - 1];
                }
                if (bos[j][i]) {
                    size++;
                }
            }
        }
        return size;
    }
}
