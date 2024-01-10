package com.剑指_Offer.秋招.二叉搜索树;

import com.剑指_Offer.TreeNode;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/18 23:16
 */
public class 二叉搜索树的最小绝对差 {
    int abs = Integer.MAX_VALUE;
    int pre = -1;
    public int getMinimumDifference(TreeNode root) {
        DFS(root);
        return abs;
    }

    public void  DFS(TreeNode root) {
        if (root == null){
            return;
        }
        DFS(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            abs = Math.min(abs, root.val - pre);
            pre = root.val;
        }
        DFS(root.right);
    }
}
