package com.剑指_Offer.春招实习;

/**
 * <pre>
 *写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/22 19:18
 */
public class 不用加减乘除做加法 {
    //和s = 非进位和n + 进位和c = a⊕b + a&b<<1
    public int add(int a, int b) {
        while(b != 0) {             // 当进位为 0 时跳出
            int c = (a & b) << 1;   // c = 进位
            a ^= b;                 // a = 非进位和
            b = c;                  // b = 进位
        }
        return a;
    }
}
