package com.剑指_Offer.秋招.哈希表;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2024/1/8 14:03
 */
public class 快乐数 {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = getNext(slow);          // 慢指针每次走一步
            fast = getNext(getNext(fast)); // 快指针每次走两步
        } while (slow != fast);           // 当快慢指针相遇时退出循环

        return slow == 1; // 如果最终慢指针指向1，则是快乐数，否则不是
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
