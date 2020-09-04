package NodeList;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val =x;
    }

    /**
     * 删除链表中指定的节点
     * @param head 表示链表的头节点
     * @param x 表示要删除的元素
     * @return
     */
    public ListNode delete(ListNode head,int x){
        //判断是不是要删除头节点
        while (head!=null){
            if (head.val!=x)break;
            head=head.next;
        }
        ListNode cur = head;
        ListNode pre = head;
        while (cur!=null){
            if (cur.val==x){
                pre.next=cur.next;
            }else {
                pre=cur;
            }
            cur=cur.next;
        }
        return head;
    }
}
