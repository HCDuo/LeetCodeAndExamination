package com.剑指_Offer.春招实习;

import com.剑指_Offer.ListNode;

/**
 * <pre>
 *给定单链表的头节点 head ，请反转链表，并返回反转后的链表的头节点。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/30 10:23
 */
public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
