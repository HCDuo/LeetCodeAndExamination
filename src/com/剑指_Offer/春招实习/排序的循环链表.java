package com.剑指_Offer.春招实习;

import com.剑指_Offer.Node;

/**
 * <pre>
 *给定循环单调非递减列表中的一个点，写一个函数向这个列表中插入一个新元素 insertVal ，使这个列表仍然是循环升序的。
 * 给定的可以是这个列表中任意一个顶点的指针，并不一定是这个列表中最小元素的指针。
 * 如果有多个满足条件的插入位置，可以选择任意一个位置插入新的值，插入后整个列表仍然保持有序。
 * 如果列表为空（给定的节点是 null），需要创建一个循环有序列表并返回这个节点。否则。请返回原先给定的节点。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/31 16:22
 */
public class 排序的循环链表 {
    public Node insert(Node head, int insertVal) {
        Node node = new Node(insertVal);
        if (head == null){
            node.next = node;
            return node;
        }
        if (head.next == null){
            head.next = node;
            node.next = head;
            return head;
        }
        Node cur = head, next = head.next;
        while(next != head){
            if (insertVal >= cur.val && insertVal <= next.val){
                break;
            }
            if (cur.val > next.val){
                if (insertVal > cur.val || insertVal < next.val) {
                    break;
                }
            }
            cur = cur.next;
            next = next.next;
        }
        cur.next = node;
        node.next = next;
        return head;
    }
}
