package com.剑指_Offer.春招;

import com.剑指_Offer.ListNode;

/**
 * <pre>
 *输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/17 14:54
 */
public class 合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newlistnode = new ListNode(0) ,cur = newlistnode;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return newlistnode.next;
    }
}
