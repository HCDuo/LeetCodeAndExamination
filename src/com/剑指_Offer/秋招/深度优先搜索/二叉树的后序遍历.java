package com.剑指_Offer.秋招.深度优先搜索;

import com.剑指_Offer.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @project Learning
 * @date 2024/1/18 15:15:24
 */
public class 二叉树的后序遍历 {
    List<Integer> answer = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        DFS(root);
        return answer;
    }

    private void DFS(TreeNode root) {
        if (root != null) {
            DFS(root.left);
            DFS(root.right);
            answer.add(root.val);
        }
    }
}
