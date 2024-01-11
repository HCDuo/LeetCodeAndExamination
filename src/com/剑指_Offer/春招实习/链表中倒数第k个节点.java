package com.剑指_Offer.春招实习;

import com.剑指_Offer.ListNode;

/**
 * <pre>
 *输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/16 12:07
 */
public class 链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode leftp = head, rightp = head;
        for(int i = 0; i < k; i++) {
            if(leftp == null) return null;
            leftp = leftp.next;
        }
        while(leftp != null) {
            leftp = leftp.next;
            rightp = rightp.next;
        }
        return rightp;
    }
}
