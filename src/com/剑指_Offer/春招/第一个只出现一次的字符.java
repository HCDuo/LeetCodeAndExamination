package com.剑指_Offer.春招;

import java.util.HashMap;
import java.util.Set;

public class 第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> hashMap = new HashMap<>();
        char[] sc = s.toCharArray();
        if ( s.length() == 1) return sc[0];
        for(char c : sc)
            hashMap.put(c, !hashMap.containsKey(c));
        for(char c : sc)
            if(hashMap.get(c)) return c;
        return ' ';
    }
}
