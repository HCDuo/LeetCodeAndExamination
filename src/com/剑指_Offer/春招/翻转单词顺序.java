package com.剑指_Offer.春招;

/**
 * <pre>
 *输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。
 * 例如输入字符串"I am a student. "，则输出"student. a am I"
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/17 15:14
 */
public class 翻转单词顺序 {
    public String reverseWords(String s) {
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuilder temp = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--;
            temp.append(s.substring(i + 1, j + 1) + " ");
            while(i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        return temp.toString().trim();

    }
}
