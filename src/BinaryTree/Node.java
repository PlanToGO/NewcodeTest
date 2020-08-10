package BinaryTree;


public class Node {
    private int val;
    private Node leftNode;
    private Node rightNode;

    public int getVal(){
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
