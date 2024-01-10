package com.剑指_Offer.春招;

import com.剑指_Offer.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *给定一棵二叉搜索树，请找出其中第 k 大的节点的值。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/3/20 22:44
 */
public class 二叉搜索树的第k大节点 {
    List<Integer> numList = new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        DFS(root);
        return numList.get(numList.size()-k);
    }

    public void DFS(TreeNode root) {
        if (root == null) return;
        DFS(root.left);
        numList.add(root.val);
        DFS(root.right);
    }

}
