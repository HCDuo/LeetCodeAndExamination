package com.剑指_Offer.秋招.双指针;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/13 13:35
 */
public class 验证回文串 {
    public boolean isPalindrome(String s) {
        //去除非字母和转小写
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit (c)) {
                stringBuilder.append(Character.toLowerCase(c));
            }
        }
        //判断返回
        int len = stringBuilder.length();
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if ( Character.toLowerCase(stringBuilder.charAt(left)) != Character.toLowerCase(stringBuilder.charAt(right)) ) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }
}
