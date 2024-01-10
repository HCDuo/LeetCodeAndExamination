package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/10/2 13:26
 */
public class 反转字符串中的单词 {
    public static String reverseWords(String s) {
        String trimmedString = s.trim();
        String result = "";
        String[] words = trimmedString.split("\\s+");
        int len = words.length;
        for (int i = len-1; i >= 0; i--) {
            if(i!=0){
                result = result + words[i] + " ";
            }else {
                result = result + words[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }
}
