package NodeList;

public class reverselist {
    public ListNode reverseList(ListNode head){
        ListNode right = head;
        ListNode left = null;
        while (right!=null){
            ListNode tmp = right.next;
            right.next=left;
            left=right;
            right=tmp;
        }
        return left;
    }
}
