package leetcode;

/**
 * 经典的BFS回溯法
 * 993
 * 首先在全局定义一个深度和父节点，便于递归
 */
public class classichuisu {
    int depth=-1;
    TreeNode parent=null;
    public boolean isCousins(TreeNode root ,int x ,int y){
        if (root==null) return false;
        return helper(root,x,y,0,null);
    }

    private boolean helper(TreeNode root, int x, int y, int d, TreeNode p) {
        if (root==null) return false;
        if ((root.val==x||root.val==y)&&d==depth&&p!=parent) return true;
        if ((root.val==x)||(root.val==y)){
            depth=d;
            parent=p;
        }
        return helper(root.left,x,y,d+1,root)||helper(root.right,x,y,d+1,root);
    }
}
