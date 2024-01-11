package com.剑指_Offer.春招实习;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 *给定两个字符串 s 和 p，找到 s 中所有 p 的 变位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 * 变位词 指字母相同，但排列不同的字符串
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/27 16:15
 */
public class 字符串中的所有变位词 {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(),m = p.length();
        if (n < m) {
            return new ArrayList<Integer>();
        }
        List<Integer> a = new ArrayList<Integer>();
        int[] ans1 = new int[26];
        int[] ans2 = new int[26];
        for (int i = 0; i < m; i++){
            ++ans1[s.charAt(i) - 'a'];
            ++ans2[p.charAt(i) - 'a'];
        }
        if (Arrays.equals(ans1,ans2)) a.add(0);
        for (int i = 0; i < n - m; i++){
            --ans1[s.charAt(i) - 'a'];
            ++ans1[s.charAt(i + m) - 'a'];
            if (Arrays.equals(ans1,ans2)) a.add(i+1);
        }
        return a;
    }
}
