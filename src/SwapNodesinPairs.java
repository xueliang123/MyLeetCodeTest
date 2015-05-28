/**
 * Created by xueliang on 15-2-10.
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode h,cur;
        h = new ListNode(0);
        h.next = head;
        cur = h;
        while (cur.next != null && cur.next.next != null) {
            ListNode tmp = cur.next.next.next;
            cur.next.next.next = cur.next;
            cur.next = cur.next.next;
            cur.next.next.next = tmp;
            cur = cur.next.next;
        }
        return h.next;
    }
}
