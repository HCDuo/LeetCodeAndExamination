package com.剑指_Offer.春招;

import com.剑指_Offer.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * <pre>
 *给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/4/10 14:23
 */
public class 二叉树每层的最大值 {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {//判断空就退出来
            return new ArrayList<Integer>();
        }
        List<Integer> res = new ArrayList<Integer>();//储存每层最大的值
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();//一层一层的节点放进去
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();//判断这一节点有多少节点
            int maxVal = Integer.MIN_VALUE;
            while (len > 0) {//把这一层的节点都取出来判断
                len--;
                TreeNode t = queue.poll();
                maxVal = Math.max(maxVal, t.val);
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }//把下一层的节点放进去
            }
            res.add(maxVal);
        }
        return res;
    }
}
