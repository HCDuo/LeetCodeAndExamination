package com.剑指_Offer.秋招.哈希表;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/12/16 10:36
 */
public class 单词规律 {

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern,s));
    }

    public static boolean wordPattern(String pattern, String s) {
        int len = pattern.length();
        String[] strs = s.split(" ");
        if (len != strs.length){
            return false;
        }
        Set<Character> patternSet = new HashSet<>();
        Set<String> sSet = new HashSet<>();
        Map<Character, String> charMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (charMap.containsKey(pattern.charAt(i))) {
                if (!charMap.get(pattern.charAt(i)).equals(strs[i])){
                    return false;
                }
            } else {
                charMap.put(pattern.charAt(i),strs[i]);
                patternSet.add(pattern.charAt(i));
                sSet.add(strs[i]);
            }
        }
        if (patternSet.size() != sSet.size()){
            return false;
        }
        return true;
    }
}
