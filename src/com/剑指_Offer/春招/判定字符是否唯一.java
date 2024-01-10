package com.剑指_Offer.春招;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/4/12 19:20
 */
public class 判定字符是否唯一 {
    public boolean isUnique(String astr) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < astr.length(); i++) {
            char c = astr.charAt(i);
            if (map.containsKey(c)) {
                return false;
            }else{
                map.put(c,1);
            }
        }
        return true;
    }
}
