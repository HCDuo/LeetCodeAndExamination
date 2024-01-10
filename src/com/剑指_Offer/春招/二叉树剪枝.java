package com.剑指_Offer.春招;

import com.剑指_Offer.TreeNode;

/**
 * <pre>
 *给定一个二叉树 根节点 root ，树的每个节点的值要么是 0，要么是 1。请剪除该二叉树中所有节点的值为 0 的子树。
 * 节点 node 的子树为 node 本身，以及所有 node 的后代。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/4/11 9:21
 */
public class 二叉树剪枝 {
//    树相关的题目首先考虑用递归解决。首先确定边界条件，当输入为空时，即可返回空。然后对左子树和右子树分别递归进行 pruneTree
//    pruneTree 操作。递归完成后，当这三个条件：左子树为空，右子树为空，当前节点的值为0，同时满足时，
//    才表示以当前节点为根的原二叉树的所有节点都为 0，需要将这棵子树移除，返回空。有任一条件不满足时，当前节点不应该移除，返回当前节点。
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        return root;
    }
}
