package leetcode;

/**
 *题目：判断是否为平衡二叉树 题号：110
 * 方法：先设置一个求树的高度的方法，然后判断左右子树的高度差异是不是超过了1，没有超过1就是一颗平衡二叉树。
 */

public class isbalanced {
    //下边的函数来求树的高度
    public int height(TreeNode root){
        if (root == null){
            return -1;
        }
        return 1+Math.max(height(root.left),height(root.right));
        //空树的高度设定为-1
    }

    public boolean isBalanced(TreeNode root){
        if (root == null) return true;
        return Math.abs(height(root.left)-height(root.right))<2 && isBalanced(root.left)&&isBalanced(root.right);
    }
}
