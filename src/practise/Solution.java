package practise;


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode detectCycle(ListNode head){
        if (head==null) return null;
        Set<ListNode> set = new HashSet<>();
        while (head!=null){
            if (set.contains(head.next)){
                return head;
            }else {
                set.add(head);
            }
            head=head.next;
        }
        return null;
    }
}
