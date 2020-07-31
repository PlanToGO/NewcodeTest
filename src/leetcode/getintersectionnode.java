package leetcode;

/**
 * 题目：相交链表  题号：160
 * 思路：相遇法，如果两个链表同时往前跑，一定会只有两种情况，下一个结点均为null或者下一个
 * 结点两个数字不为null并且相等。
 */

public class getintersectionnode {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if (headA==null||headB==null) return null;
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA!=pB){
            pA=pA==null?headB:pA.next;
            pB=pB==null?headA:pB.next;
        }
        return pA;
    }
}
