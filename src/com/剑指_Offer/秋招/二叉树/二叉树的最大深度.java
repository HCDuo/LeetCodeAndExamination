package com.剑指_Offer.秋招.二叉树;

import com.剑指_Offer.TreeNode;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/17 12:47
 */
public class 二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // 空节点的深度为0
        } else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return Math.max(leftDepth, rightDepth) + 1; // 返回左右子树中较大深度加1
        }
    }
}
