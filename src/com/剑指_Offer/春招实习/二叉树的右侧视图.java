package com.剑指_Offer.春招实习;

import com.剑指_Offer.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/4/11 9:09
 */
public class 二叉树的右侧视图 {
    int height = 0;
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        Dfs(root,list,0);
        return list;
    }

    public void Dfs(TreeNode root,List list,int h) {
        if (root == null) return;
        if (h == height){
            height++;
            list.add(root.val);
        }
        if (root.right != null) Dfs(root.right,list,h+1);
        if (root.left != null) Dfs(root.left,list,h+1);
    }
}
