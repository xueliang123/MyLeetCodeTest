/**
 * Created by xueliang on 15-3-26.
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0)
            return head;
        ListNode first, second, beforeHead;
        beforeHead = new ListNode(0);
        beforeHead.next = head;
        first = second = beforeHead;
        while (k > 0 && first.next != null) {
            first = first.next;
            k --;
        }
        if (k > 0 || first.next == null) {
            return head;
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        beforeHead.next = second.next;
        first.next = head;
        second.next = null;
        return beforeHead.next;
    }
}
