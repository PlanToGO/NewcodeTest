package leetcode;

/**
 * 题目： 删除链表的倒数第N个节点  题号：19
 * 注意：引入了一个dummy节点，用处是为了避免出现删除头节点的情况
 */
public class removenthfromend {
    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = head;
        int len = 0;
        while (p!=null){
            p=p.next;
            len++;
        }
        int index = 0;
        p=dummy;
        while (index<(len-n)){
            p=p.next;
            index++;
        }
        p.next=p.next.next;
        return dummy.next;
    }
}
