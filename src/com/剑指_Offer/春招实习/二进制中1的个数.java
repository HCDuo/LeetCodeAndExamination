package com.剑指_Offer.春招实习;

/**
 * <pre>
 *编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为 汉明重量).）。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/22 18:10
 */
public class 二进制中1的个数 {
    //循环右移
    public int hammingWeight1(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
    //n&(n-1)
    //n        = 10101000
    //n-1      = 10100111
    //n&(n-1)  = 10100000
    public int hammingWeight2(int n) {
        int res = 0;
        while(n != 0) {
            res++;
            n &= n - 1;
        }
        return res;
    }

}
