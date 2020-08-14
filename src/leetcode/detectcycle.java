package leetcode;

import java.util.HashSet;
import java.util.Set;

public class detectcycle {
    public ListNode detectCycle(ListNode head){
        if (head==null) return head;
        Set<ListNode> nodes = new HashSet<>();
        ListNode ans = null;
        while (head!=null){
            if (nodes.contains(head)){
                ans = head;
                break;
            }else {
                nodes.add(head);
            }
            head=head.next;
        }
        return ans;
    }
}
