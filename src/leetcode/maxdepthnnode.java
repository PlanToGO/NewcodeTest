package leetcode;
/**
 * 题目：N叉树的深度
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class maxdepthnnode {
    public int maxDepth(Node root){
        if (root==null) {
            return 0;
        }else if (root.children.isEmpty()){
            return 1;
        }else {
            List<Integer> heights = new LinkedList<>();
            for (Node item: root.children){
                heights.add(maxDepth(item));
            }
            return Collections.max(heights)+1;
        }
    }
}
