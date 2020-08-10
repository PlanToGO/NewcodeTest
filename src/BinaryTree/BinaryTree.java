package BinaryTree;

public class BinaryTree {
    private Node root;
    public BinaryTree(){
    }
    public BinaryTree(Node root){
        this.root = root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    //清空树
    public void clear(Node node){
        if (node!=null){
            clear(node.getLeftNode());
            clear(node.getRightNode());
            node = null;
        }
    }
    public void clear(){
        clear(root);
    }

    //判断树是否为空
    public boolean isEmpty(){
        return root==null;
    }

    //计算树的高度
    public int height(Node node){
        if (node==null){
            return 0;
        }else {
            int l_height = height(node.getLeftNode());
            int r_height = height(node.getRightNode());
            return l_height>r_height?(l_height+1):(r_height+1);
        }
    }
    public int height(){
        return height(root);
    }

    //计算树的节点的个数
    public int size(Node node){
        if (node==null){
            return 0;
        }else {
            return 1+size(node.getLeftNode())+size(node.getRightNode());
        }
    }
    public int size(){
        return size(root);
    }

//二叉树的三种遍历
    //前序遍历
    public void preOrder(Node root){
        if (root!=null){
            System.out.println(root.getVal());
            preOrder(root.getLeftNode());
            preOrder(root.getRightNode());
        }
    }
    //中序遍历
    public void inOrder(Node root){
        if (root!=null){
            inOrder(root.getLeftNode());
            System.out.println(root.getVal());
            inOrder(root.getRightNode());
        }
    }
    //后序遍历
    public void postOrder(Node root){
        if (root!=null){
            postOrder(root.getLeftNode());
            postOrder(root.getRightNode());
            System.out.println(root.getVal());
        }
    }

    
}
