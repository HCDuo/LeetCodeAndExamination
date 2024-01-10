package com.剑指_Offer;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/20 12:50
 */
public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node child;
    public Node prev;
    public Node next;
    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
