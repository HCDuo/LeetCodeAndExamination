package com.剑指_Offer.秋招.哈希表;

import java.util.HashMap;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/16 21:44
 */
public class 赎金信 {
    public boolean canConstruct(String ransomNote, String magazine) {
//        HashMap<Character, Integer> ransomNotes = new HashMap<Character, Integer>();
        HashMap<Character, Integer> magazines = new HashMap<Character, Integer>();
        for (int i = 0; i < magazine.length(); i++) {
            char character = magazine.charAt(i);
            if (magazines.containsKey(character)) {
                magazines.put(character,magazines.get(character) + 1);
            }else {
                magazines.put(character, 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char character = ransomNote.charAt(i);
            if (magazines.get(character) == null || magazines.get(character) == 0) {
                return false;
            }else {
                magazines.put(character,magazines.get(character) - 1);
            }
        }
        return true;
    }
}
