package NodeList;

import java.util.*;

public class sortlist {
    public ListNode sortList(ListNode head){
        ArrayList<ListNode> arrayList = new ArrayList<>();
        while (head!=null){
            arrayList.add(head);
            head=head.next;
        }
        ListNode helper  = new ListNode(999999);
        ListNode helperhp = helper;
        Collections.sort(arrayList, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for (int i=0;i<arrayList.size();i++){
            helper.next=arrayList.get(i);
            if (i!=arrayList.size()-1){
                helper=helper.next;
            }else {
                helper=null;
            }
        }
        return helperhp.next;
    }
}
