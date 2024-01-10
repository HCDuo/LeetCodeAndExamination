package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/29 16:58
 */
public class 罗马数字转整数 {
    public static int romanToInt(String s) {
        char[] str = s.toCharArray();
        int len = s.length();
        int ans = getValue(str[len-1]);
        for (int i = len - 2; i >= 0; i--) {
            int last = getValue(str[i+1]);
            int temp = getValue(str[i]);
            if (last > temp){
                ans -= temp;
            }else {
                ans += temp;
            }
        }
        return ans;
    }

    public static int getValue(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }
}
