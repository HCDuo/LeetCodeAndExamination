package com.剑指_Offer.春招;

import com.剑指_Offer.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 * 叶子节点 是指没有子节点的节点。
 * </pre>
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/4/12 19:00
 */
public class 二叉树的所有路径 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        DFS(root,"",list);
        return list;
    }
    public void DFS(TreeNode root,String path, List<String> paths){
        if (root != null){
            StringBuffer pathString = new StringBuffer(path);
            pathString.append(Integer.toString(root.val));
            if(root.left == null && root.right == null){
                paths.add(pathString.toString());
            }else{
                pathString.append("->");
                DFS(root.left,pathString.toString(),paths);
                DFS(root.right,pathString.toString(),paths);
            }
        }
    }
}
