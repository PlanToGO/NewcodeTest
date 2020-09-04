package NodeList;

public class middlenode {
    public ListNode middleNode(ListNode head){
        ListNode[] listNodes = new ListNode[100];
        int index=0;
        while (head!=null){
            listNodes[index]=head;
            head=head.next;
            index++;
        }
        return listNodes[index/2];
    }
}
