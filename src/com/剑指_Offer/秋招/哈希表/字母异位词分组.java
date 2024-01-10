package com.剑指_Offer.秋招.哈希表;

import java.util.*;
/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2024/1/7 14:18
 */
public class 字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagramGroups = new HashMap<>();
        for (String str : strs) {
            // 将字符串按照字母顺序排列
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            // 将排序后的字符串作为 key 放入哈希表中
            anagramGroups.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }
        // 将哈希表中的值转换为结果列表
        result.addAll(anagramGroups.values());
        return result;
//        List<List<String>> result = new ArrayList<List<String>>();
//        boolean[] isIN = new boolean[strs.length];
//        int len = strs.length;
//        for (int i = 0; i < len; i++) {
//            List<String> lists = new ArrayList<>();
//            if (isIN[i]){
//                continue;
//            }
//            lists.add(strs[i]);
//            for (int j = i; j < len; j++) {
//                if (!isIN[j]) {
//                    if (areStringsEqual(strs[i], strs[j])) {
//                        lists.add(strs[j]);
//                        isIN[j] = true;
//                    }
//                }
//            }
//            result.add(lists);
//        }
//        return result;
    }

    public static boolean areStringsEqual(String str1, String str2) {
        Map<Character, Integer> charCount1 = new HashMap<>();
        Map<Character, Integer> charCount2 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            charCount2.put(c, charCount2.getOrDefault(c, 0) + 1);
        }
        return charCount1.equals(charCount2);
    }
}
