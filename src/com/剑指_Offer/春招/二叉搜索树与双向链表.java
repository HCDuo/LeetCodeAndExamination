package com.剑指_Offer.春招;

import com.剑指_Offer.Node;

/**
 * <pre>
 *输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/20 12:51
 */
public class 二叉搜索树与双向链表 {
    Node pre, head;
    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        DFS(root);
        pre.right = head;
        head.left = pre;
        return head;
    }

    public void DFS(Node cur) {
        if(cur == null) return;
        DFS(cur.left);
        if(pre != null) pre.right  = cur;
        else head = cur;
        cur.left = pre;
        pre = cur;
        DFS(cur.right);
    }

}
