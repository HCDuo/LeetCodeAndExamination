package com.剑指_Offer.秋招.数学;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/2 1:56
 */
public class 回文数 {
    public boolean isPalindrome(int x) {
        // 负数肯定不是回文数，以0结尾的非0数也不可能是回文数
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，可以通过 reversed/10 去掉中间位的数字
        return x == reversed || x == reversed / 10;
    }

}
