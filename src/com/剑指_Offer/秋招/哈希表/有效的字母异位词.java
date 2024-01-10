package com.剑指_Offer.秋招.哈希表;

import java.util.*;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/12/25 13:27
 */
public class 有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int len = s.length();
        Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (mapS.containsKey(s.charAt(i))) {
                mapS.put(s.charAt(i),mapS.get(s.charAt(i))+1);
            } else{
                mapS.put(s.charAt(i),1);
            }
            if (mapT.containsKey(t.charAt(i))) {
                mapT.put(t.charAt(i),mapT.get(t.charAt(i))+1);
            } else{
                mapT.put(t.charAt(i),1);
            }
        }
        if (mapS.size() != mapT.size()) {
            return false;
        }
        // 检查键的集合是否相同
        if (!mapS.keySet().equals(mapT.keySet())) {
            return false;
        }

        // 检查每个键对应的值是否相同
        for (Character key : mapS.keySet()) {
            if (!mapS.get(key).equals(mapT.get(key))) {
                return false;
            }
        }
        return true;
    }
}
