package practise;

import java.util.LinkedList;


public class reverselist {
    public ListNode ReverseList(ListNode head){
        if (head==null) return null;
        LinkedList<ListNode> listNodes = new LinkedList<>();
        ListNode tmp = head;
        while (tmp!=null){
            listNodes.push(tmp);
            tmp=tmp.next;
        }
        head.next=null;
        ListNode newnode = listNodes.pop();
        ListNode res = newnode;
        while (!(listNodes.size()==0)){
            newnode.next=listNodes.pop();
            newnode=newnode.next;
        }
        return res;
    }
}
