package leetcode;

/**
 * 题目：层次遍历二叉树
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class levelOrder {
    public List<List<Integer>> levelorder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> myqueue = new LinkedList<>();
        if (root==null) return null;
        myqueue.add(root);
        while (!myqueue.isEmpty()){
            ArrayList<Integer> nowlist = new ArrayList<>();
            int size = myqueue.size();
            for (int i=0;i<size;i++){
                root = myqueue.poll();
                nowlist.add(root.val);
                if (root.left!=null) myqueue.add(root.left);
                if (root.right!=null) myqueue.add(root.right);
            }
            result.add(nowlist);
        }
        return result;
    }
}
