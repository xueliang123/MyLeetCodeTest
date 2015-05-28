/**
 * Created by xueliang on 15-1-20.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null) {
            if (fast == slow)
                return true;
            fast = fast.next == null ? null : fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
