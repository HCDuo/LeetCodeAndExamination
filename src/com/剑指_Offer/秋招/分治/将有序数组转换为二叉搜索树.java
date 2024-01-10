package com.剑指_Offer.秋招.分治;

import com.剑指_Offer.TreeNode;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/25 16:40
 */
public class 将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2; // 找到中间元素的索引
        TreeNode root = new TreeNode(nums[mid]); // 使用中间元素创建根节点

        // 递归构建左子树和右子树
        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);

        return root;
    }
}
