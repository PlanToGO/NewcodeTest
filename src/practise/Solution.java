package practise;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution{
    public List<List<Integer>> levelorder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root==null) return res;
        //建立一个辅助的队列
        LinkedList<TreeNode> linkedList = new LinkedList();
        linkedList.push(root);
        while (!linkedList.isEmpty()){
            ArrayList<Integer> tmp = new ArrayList<>();
            int size = linkedList.size();
            for (int i=0;i<size;i++){
                tmp.add(linkedList.get(i).val);
            }
            res.add(tmp);
        }
        return res;
    }
}
