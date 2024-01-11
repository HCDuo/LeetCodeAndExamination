package com.剑指_Offer.春招实习;

import java.util.HashSet;
import java.util.Set;

/**
 * <pre>
 *给定一个字符串 s ，请你找出其中不含有重复字符的 最长连续子字符串 的长度。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/27 16:54
 */
public class 不含重复字符的最长子字符串 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> news = new HashSet<Character>();
        int n = s.length();
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                news.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !news.contains(s.charAt(rk + 1))) {
                news.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
