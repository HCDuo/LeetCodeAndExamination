package com.剑指_Offer.秋招.链表;

import com.剑指_Offer.ListNode;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/17 12:33
 */
public class 环形链表 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode lower = head;
        ListNode fasrier = head.next;
        while (lower != fasrier)
        {
            if (fasrier == null || fasrier.next == null){
                return false;
            }
            lower = lower.next;
            fasrier = fasrier.next.next;
        }
        return true;
    }
}
