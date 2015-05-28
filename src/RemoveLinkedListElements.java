/**
 * Created by xueliang on 15-4-23.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre, cur, newHead;
        newHead = new ListNode(0);
        newHead.next = head;
        pre = newHead;
        cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = pre.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return newHead.next;
    }
}
