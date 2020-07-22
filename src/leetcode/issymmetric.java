package leetcode;

//题目：对称二叉树 序号：101
//解题思路：和100类似，用的是递归的方法，但是要多写一个方法


public class issymmetric {
    public boolean isSymmetric(TreeNode root){
        return check(root,root);
    }
    public boolean check(TreeNode p,TreeNode q){
        if (p==null&&q==null)return true;
        if (p==null||q==null)return false;
        return p.val==q.val&&check(p.left,q.right)&&check(p.right,q.left);
    }
}
