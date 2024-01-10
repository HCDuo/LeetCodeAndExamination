package com.剑指_Offer.秋招.数组字符串;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/30 11:40
 */
public class 最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        int len = s.length();
        boolean mark = false;
        for (int i = len-1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (mark){
                    break;
                }else {
                    continue;
                }
            }
            ans++;
            mark = true;
        }
        return ans;
    }
}
