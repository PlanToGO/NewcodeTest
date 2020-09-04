package NodeList;

import java.util.HashSet;
import java.util.Set;

public class isCircle {
    public boolean iscircle(ListNode head){
        if (head==null) return false;
        Set<ListNode> set = new HashSet<>();
        while (head!=null){
            if (set.contains(head)){
                return true;
            }else {
                set.add(head);
                head=head.next;
            }
        }
        return false;
    }
}
