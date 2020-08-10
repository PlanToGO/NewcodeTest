package BinaryTree;

public class TreeNode<T> {
    public T val;
    public TreeNode<T> left;
    public TreeNode<T> right;
    public TreeNode(T val){
        this.val=val;
    }
    public T getVal() {
        return val;
    }
    public void setVal(T val) {
        this.val = val;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }
}
