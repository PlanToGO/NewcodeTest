package leetcode;

//题目：二叉树的最大深度 题号：104
//思路：递归的方法进行查询

public class maxdepth {
    public int maxDepth(TreeNode root){
        if (root == null) return 0;
        int left_height = maxDepth(root.left);
        int right_height = maxDepth(root.right);
        return Math.max(left_height,right_height)+1;
    }
}
