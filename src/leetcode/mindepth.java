package leetcode;

/**
 * 题目：二叉树的最小深度 题号：111
 * 思路：采用递归的方法，用Math.min的方法对最小深度进行求解
 */

public class mindepth {
    public int minDepth(TreeNode root){
        if (root == null) return 0;
        if ((root.left==null) && (root.right==null)) return 1;
        int min_depth = Integer.MAX_VALUE;
        if (root.left!=null){
            min_depth = Math.min(minDepth(root.left),min_depth);
        }
        if (root.right!=null){
            min_depth = Math.min(minDepth(root.right),min_depth);
        }
        return min_depth+1;
    }
}
