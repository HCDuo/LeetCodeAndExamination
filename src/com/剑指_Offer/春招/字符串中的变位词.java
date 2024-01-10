package com.剑指_Offer.春招;

import java.util.Arrays;

/**
 * <pre>
 *给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的某个变位词。
 * 换句话说，第一个字符串的排列之一是第二个字符串的子串 。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/27 15:55
 */
public class 字符串中的变位词 {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(),m = s2.length();
        if (n > m) return false;
        int[] ans1 = new int[26];
        int[] ans2 = new int[26];
        for (int i = 0; i < n; i++){
            ++ans1[s1.charAt(i) - 'a'];
            ++ans2[s2.charAt(i) - 'a'];
        }
        if (Arrays.equals(ans1,ans2)) return true;
        for (int i = n; i < m; i++){
            ++ans2[s2.charAt(i) - 'a'];
            --ans2[s1.charAt(i - n) - 'a'];
            if (Arrays.equals(ans1,ans2)) return true;
        }
        return false;
    }
}
