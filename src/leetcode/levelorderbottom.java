package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 题目：二叉树的层次遍历 题号：107
 * 思路：类似二叉树的层次遍历，采用队列的方法，使用了队列先进后出的特性，但是需要
 *      引入一个辅助队列，同时要知道什么时候那一行是遍历完成了
 */

public class levelorderbottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        //循环的指针
        TreeNode p =root;
        //要返回的结果list
        List<List<Integer>> result = new LinkedList<>();
        //辅助的队列
        Queue<TreeNode> myQueue = new LinkedList<TreeNode>();
        //如果是空的树那就返回空表
        if (p==null)return result;
        //如果不是空的就将根节点入队
        myQueue.offer(p);
        while (!myQueue.isEmpty()){
            //创建一个临时的链表用于存储要遍历的内容
            List<Integer> tempList = new ArrayList<>();
            //辅助队列的长度
            int length = myQueue.size();
            //进行length次的循环，每次循环都把队顶的元素出队，同时将队顶的元素送入临时列表
            for (int i = 0 ; i<length ; i++){
                p = myQueue.poll();
                tempList.add(p.val);
                if (p.left != null) myQueue.offer(p.left);
                if (p.right != null) myQueue.offer(p.right);
            }
            result.add(0,tempList);
        }
        return result;
    }
}
