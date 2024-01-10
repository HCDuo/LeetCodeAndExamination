package com.剑指_Offer.春招;

import com.剑指_Offer.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * <pre>
 *给定一个链表，返回链表开始入环的第一个节点。 从链表的头节点开始沿着 next 指针进入环的第一个节点为环的入口节点。如果链表无环，则返回 null。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/29 17:48
 */
public class 链表中环的入口节点 {
    //快慢指针或者哈希
    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visis = new HashSet<>();
        while(pos != null) {
            if(visis.contains(pos)){
                return pos;
            }
            else {
                visis.add(pos);
                pos = pos.next;
            }
        }
        return null;
    }
}
