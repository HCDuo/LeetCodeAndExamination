package com.剑指_Offer.春招实习;

/**
 * <pre>
 *给定两个整数 a 和 b ，求它们的除法的商 a/b ，要求不得使用乘号 '*'、除号 '/' 以及求余符号 '%' 。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/23 10:47
 */
public class 整数除法 {
    public int divide(int a, int b) {
        //剪枝：判断超出范围
        if (a == Integer.MIN_VALUE && b == -1) return Integer.MAX_VALUE;
        //判断符号
        boolean flag = false;
        if ((a < 0 && b < 0) || (a > 0 && b > 0)) flag = true;
        long dividend = Math.abs((long) a);
        long divisor = Math.abs((long) b);
        //剪枝：除数大于被除数
        if (dividend < divisor) return 0;

        int result = 0; //结果
        int shift = 31; //位数

        while (dividend >= divisor) {
            while (dividend < divisor << shift) {
                shift--;
            }
            dividend -= divisor << shift;
            result += 1 << shift;
        }
        return flag ? result : -result;
    }
}
