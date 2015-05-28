/**
 * Created by xueliang on 14-12-30.
 */
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode
                pre = null,
                index = head,
                tmp = head;
        while (n > 0) {
            tmp = tmp.next;
            n--;
        }
        while (tmp != null) {
            if (pre == null)
                pre = head;
            else
                pre = pre.next;
            index = index.next;
            tmp = tmp.next;
        }
        if (pre == null)
            head = index.next;
        else {
            pre.next = index.next;
        }
        return head;
    }
}
