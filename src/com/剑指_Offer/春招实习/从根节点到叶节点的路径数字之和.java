package com.剑指_Offer.春招实习;

import com.剑指_Offer.TreeNode;

/**
 * <pre>
 *给定一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
 * 每条从根节点到叶节点的路径都代表一个数字：
 * 例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
 * 计算从根节点到叶节点生成的 所有数字之和 。
 * 叶节点 是指没有子节点的节点。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/4/11 9:55
 */
public class 从根节点到叶节点的路径数字之和 {
    public int sumNumbers(TreeNode root) {
        return Dfs(root,0);
    }

    public int Dfs(TreeNode root,int beforesum){
        if (root == null) {
            return 0;
        }
        int sum = beforesum * 10 +root.val;
        if (root.left == null && root.right == null){
            return sum;
        }else{
            return Dfs(root.left,sum) + Dfs(root.right,sum);
        }
    }
}
