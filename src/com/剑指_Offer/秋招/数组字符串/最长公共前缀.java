package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/30 11:54
 */
public class 最长公共前缀 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();
        boolean match = true;
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if ( i == strs[j].length() || c != strs[j].charAt(i) ) {
                    match = false;
                    break;
                }
            }
            if (match) {
                answer.append(c);
            }else {
                break;
            }

        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"ab","a"};
        System.out.println(longestCommonPrefix(strs));
    }
}
