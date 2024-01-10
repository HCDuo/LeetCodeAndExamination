package com.剑指_Offer.春招;

import com.剑指_Offer.ListNode;

/**
 * <pre>
 *给定一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/29 17:35
 */
public class 删除链表的倒数第n个结点 {
    //双指针，前指针比后指针多走n步
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
