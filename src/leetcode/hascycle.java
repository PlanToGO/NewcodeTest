package leetcode;

/**
 * 题目：环形链表 题号：141
 * 思路：遍历所有节点并在哈希表中存储每个结点的引用。如果当前结点为null，那么我们已经遍历完整个链表，并且
 * 该链表不是环形链表，如果当前结点的引用在哈希链表中，那么返回true
 */

import java.util.HashSet;
import java.util.Set;

public class hascycle {
    public boolean hasCycle(ListNode head){
        if (head==null)return false;
        Set<ListNode> nodesSeen = new HashSet<>();
        while (head!=null){
            if (nodesSeen.contains(head)){
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
