package BinaryTree;

/**
 * 二叉树的层次遍历
 */


import java.util.LinkedList;

public class LevelIterator {
    public void levelIterator(Node root){
        if (root==null) return;
        LinkedList<Node> queue = new LinkedList<Node>();
        Node current = null;
        queue.offer(root);
        while (!queue.isEmpty()){
            current = queue.poll();
            System.out.println("->"+current.getVal());
            if (current.getLeftNode()!=null){
                queue.offer(current.getLeftNode());
            }
            if (current.getRightNode()!=null){
                queue.offer(current.getRightNode());
            }
        }
    }
}
