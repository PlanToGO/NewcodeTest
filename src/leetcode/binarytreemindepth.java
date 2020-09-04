package leetcode;

public class binarytreemindepth {
    public int mindepth(TreeNode root){
        if (root==null) return 0;
        if (root.left==null) return mindepth(root.right)+1;
        if (root.right==null) return mindepth(root.left)+1;
        return Math.min(mindepth(root.left),mindepth(root.right))+1;
    }
}
