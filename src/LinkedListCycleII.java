/**
 * Created by xueliang on 15-1-20.
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null) {
            if (fast == slow){
                ListNode tmp = head;
                while (tmp != slow) {
                    tmp = tmp.next;
                    slow = slow.next;
                }
                return tmp;
            }
            fast = fast.next == null ? null : fast.next.next;
            slow = slow.next;
        }
        return null;
    }
}
