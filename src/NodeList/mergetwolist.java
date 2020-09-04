package NodeList;

public class mergetwolist {
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode newlist = new ListNode(999);
        ListNode newlistbp = newlist;
        while (cur1!=null&&cur2!=null){
                if (cur1.val<cur2.val){
                    newlist.next=cur1;
                    newlist=newlist.next;
                    cur1=cur1.next;
                }else {
                    newlist.next=cur2;
                    newlist=newlist.next;
                    cur2=cur2.next;
                }
            }
        newlist.next=cur1==null?cur2:cur1;
        return newlistbp.next;
    }
}
