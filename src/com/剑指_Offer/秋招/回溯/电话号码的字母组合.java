package com.剑指_Offer.秋招.回溯;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/25 16:01
 */
public class 电话号码的字母组合 {
    public List<String> letterCombinations(String digits) {
        List<String> strings = new ArrayList<String>();
        if (digits.length() == 0){
            return strings;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(strings,phoneMap,digits,0,new StringBuffer());
        return strings;
    }
    public void backtrack(List<String> combinations , Map<Character, String> phoneMap, String digits,int index,StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            String letter = phoneMap.get(digit);
            int letterCount = letter.length();
            for (int i = 0; i < letterCount; i++) {
                combination.append(letter.charAt(i));
                backtrack(combinations,phoneMap,digits,index + 1,combination);
                combination.deleteCharAt(index);
            }
        }
    }
}
