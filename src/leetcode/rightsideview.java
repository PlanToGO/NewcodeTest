package leetcode;

/**
 * 题目：二叉树的右视图 题号：199
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class rightsideview {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> myqueue = new LinkedList<>();
        if (root==null) return result;
        myqueue.offer(root);
        while (!myqueue.isEmpty()){
            LinkedList<Integer> tmpList = new LinkedList<>();
            int size = myqueue.size();
            for (int i=0;i<size;i++){
                TreeNode tmp =  myqueue.poll();
                tmpList.offer(tmp.val);
                if (tmp.left!=null) myqueue.offer(tmp.left);
                if (tmp.right!=null) myqueue.offer(tmp.right);
            }
            result.add(tmpList.pollLast());
        }
        return result;
    }
}
