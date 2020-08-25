package practise;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        LinkedList<TreeNode> tmp = new LinkedList<>();
        tmp.add(root);
        while (!tmp.isEmpty()){
            ArrayList<Integer> arrayList = new ArrayList<>();
            int size = tmp.size();
            for (int i=0;i<size;i++){
                root = tmp.poll();
                arrayList.add(root.val);
                if (root.left!=null) tmp.add(root.left);
                if (root.right!=null) tmp.add(root.right);
            }
            res.add(arrayList);
        }
        return res;
    }
}
