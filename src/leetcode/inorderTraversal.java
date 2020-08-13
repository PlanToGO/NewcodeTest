package leetcode;

/**
 * 题目：二叉树的中序遍历 题号：94
 */

import java.util.ArrayList;
import java.util.List;

public class inorderTraversal {
    public List<Integer> inordertraversal(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if (root==null) return result;
        inorder(root,result);
        return result;
    }
    public static void inorder(TreeNode node,ArrayList<Integer> result){
        if (node.left!=null) inorder(node.left,result);
        result.add(node.val);
        if (node.right!=null) inorder(node.right,result);
    }
}
