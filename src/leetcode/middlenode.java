package leetcode;
//876
import java.util.ArrayList;

public class middlenode {
    public ListNode middleNode(ListNode head){
        int len=1;
        ArrayList<ListNode> arrayList = new ArrayList<>();
        arrayList.add(head);
        while (head.next!=null){
            arrayList.add(head.next);
            len++;
            head=head.next;
        }
        return arrayList.get(len/2);
    }
}
