package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/10/3 10:07
 */
public class 找出字符串中第一个匹配项的下标 {
    public static int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        for (int i = 0; i <= haystackLength-needleLength; i++) {
            int haystackLocal = i;
            int needleLocal = 0;
            while(needleLocal < needleLength && haystack.charAt(haystackLocal)==needle.charAt(needleLocal)){
                haystackLocal++;
                needleLocal++;
            }
            if(needleLocal == needleLength){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
}
