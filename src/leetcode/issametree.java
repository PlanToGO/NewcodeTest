package leetcode;

/**
 * 题目名称：相同的树 题目编号：100
 * 解题方法：使用递归的思路
 */

public class issametree {
    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p==null&&q==null)return true;
        if (p==null||q==null)return false;
        if (p.val != q.val)return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
