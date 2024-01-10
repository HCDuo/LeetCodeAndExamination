package com.剑指_Offer.春招;

import com.剑指_Offer.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 *给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 * 叶子节点 是指没有子节点的节点。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * &#064;date:2023/3/19  0:07
 */
public class 二叉树中和为某一值的路径 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        DFS(root,target);
        return res;
    }

    public void DFS(TreeNode root, int target){
        if (root == null) return ;
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null)
        {
            res.add(new LinkedList(path));
        }
        DFS(root.left, target);
        DFS(root.right,target);
        path.removeLast();
    }
}
