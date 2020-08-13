package leetcode;
/**
 * 题目：反转链表 题号：206
 */

import java.util.LinkedList;

public class reverseList {
    public ListNode reverselist(ListNode head){
        int size = 0;
        LinkedList<Integer> myqueue = new LinkedList<>();
        if (head!=null) {
            size++;
            myqueue.add(head.val);
        }else {
            return null;
        }
        while (head.next!=null){
            size++;
            myqueue.add(head.val);
            head=head.next;
        }
        ListNode result = new ListNode(head.val);
        head=result;
        for (int i=0;i<size-1;i++){
            head.next=new ListNode(myqueue.removeLast());
            head=head.next;
        }
        return result;
    }

    public ListNode reverselist1(ListNode head){
        ListNode now = head;
        ListNode prev = null;
        while (now != null){
            ListNode tmp = now.next;
            now.next = prev;
            prev = now;
            now = tmp;
        }
        return prev;
    }
}
