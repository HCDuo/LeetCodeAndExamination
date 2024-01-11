package com.剑指_Offer.春招实习;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/16 0:12
 */
public class 最长不含重复字符的子字符串 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int maxs = 0,temp = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = dic.getOrDefault(s.charAt(i),-1);
            dic.put(s.charAt(i),i);
            temp = temp < i - j ? temp +1 : i - j;
            maxs = Math.max(temp , maxs);
        }
        return maxs;
    }
}
