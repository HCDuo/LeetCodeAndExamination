package com.剑指_Offer.春招实习;

/**
 * <pre>
 *给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。
 * 请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。

 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/16 0:06
 */
public class 把数字翻译成字符串 {
    public int translateNum(int num) {
        char[] ch = String.valueOf(num).toCharArray();
        int length = ch.length;
        int[] dp = new int[length + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= length; i++){
            int n = (ch[i - 2] - '0') * 10 + (ch[i - 1] - '0');
            if(n >= 10 && n <= 25){
                dp[i] = dp[i - 1] + dp[i - 2];
            }else{
                dp[i] = dp[i - 1];
            }
        }
        return dp[length];
    }
}
