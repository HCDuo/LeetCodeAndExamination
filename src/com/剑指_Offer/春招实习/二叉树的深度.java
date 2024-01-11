package com.剑指_Offer.春招实习;

import com.剑指_Offer.TreeNode;

/**
 * <pre>
 *输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/21 20:33
 */
public class 二叉树的深度 {
    int maxn = 0, temp = 0;
    public int maxDepth(TreeNode root) {
        DFS(root);
        return maxn;
    }

    public void DFS(TreeNode root){
        if (root == null) return;
        temp++;
        maxn = Math.max(temp,maxn);
        DFS(root.left);
        DFS(root.right);
        temp--;
        return;
    }
}
