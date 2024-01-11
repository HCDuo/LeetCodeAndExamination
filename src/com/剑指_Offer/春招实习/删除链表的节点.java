package com.剑指_Offer.春招实习;

import com.剑指_Offer.ListNode;

/**
 * <pre>
 *给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *返回删除后的链表的头节点。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/16 11:44
 */
public class 删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val) return head.next;
        ListNode temp = head;
        ListNode cur = head.next;
        while(cur != null && cur.val != val){
            temp = cur;
            cur = cur.next;
        }
        if(cur != null) temp.next = cur.next;
        return head;
    }
}
