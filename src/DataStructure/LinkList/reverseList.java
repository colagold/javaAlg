package DataStructure.LinkList;

public class reverseList {
    public ListNode reverseList(ListNode head) {
        if(head.next==null) {
            return head;
        }
        ListNode last=reverseList(head.next);
        return null;
    }
}
