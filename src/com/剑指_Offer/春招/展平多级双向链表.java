package com.剑指_Offer.春招;

import com.剑指_Offer.Node;

/**
 * <pre>
 *多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。这些子列表也可能会有一个或多个自己的子项，
 * 依此类推，生成多级数据结构，如下面的示例所示。
 * 给定位于列表第一级的头节点，请扁平化列表，即将这样的多级双向链表展平成普通的双向链表，使所有结点出现在单级双链表中。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/31 13:14
 */
public class 展平多级双向链表 {
    public Node flatten(Node head) {
        DFS(head);
        return head;
    }
    public Node DFS(Node head) {
        if(head == null) return null;
        Node cur = head;
        Node last = null; // 记录链表的最后一个节点
        while (cur != null){
            Node next = cur.next;
            if (cur.child != null){//  如果有子节点，那么首先处理子节点
                Node childlast = DFS(cur.child);
                next = cur.next;
                cur.next = cur.child;//  将 node 与 child 相连
                cur.child.prev = cur;
                if (next != null) {//  如果 next 不为空，就将 last 与 next 相连
                    childlast.next = next;
                    next.prev = childlast;
                }
                cur.child = null; // 将 child 置为空
                last = childlast;
            }else {
                last = cur;
            }
            cur = next;
        }
        return last;
    }
}
