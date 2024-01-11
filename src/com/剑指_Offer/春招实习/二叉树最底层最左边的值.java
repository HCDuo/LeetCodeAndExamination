package com.剑指_Offer.春招实习;

import com.剑指_Offer.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * <pre>
 *给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
 * 假设二叉树中至少有一个节点
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * &#064;date:2023/4/11  8:39
 */
public class 二叉树最底层最左边的值 {
//    深搜
//    int value = 0;
//    int curheight = 0;
//    public int findBottomLeftValue(TreeNode root) {
//        DFS(root,0);
//        return value;
//    }
//
//    public void DFS(TreeNode root,int height){
//        if (root == null) return;
//        height++;
//        DFS(root.left,height);
//        DFS(root.right,height);
//        if(height > curheight){
//            curheight = height;
//            value = root.val;
//        }
//    }
//    广搜
    public int findBottomLeftValue(TreeNode root) {
        int temp = 0;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode p = queue.poll();
            if (p.right != null){
                queue.offer(p.right);
            }
            if (p.left != null){
                queue.offer(p.left);
            }
            temp = p.val;
        }
        return temp;
    }
}
