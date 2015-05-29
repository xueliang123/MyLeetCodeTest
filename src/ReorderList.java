/**
 * Created by 亮 on 2015/4/12.
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null)
            return;
        ListNode slow, fast;
        slow = fast = head;
        while (fast.next != null) {
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            } else {
                break;
            }
        }
        ListNode secondHalfHead = new ListNode(0);
        ListNode index = slow.next;
        slow.next = null;
        while (index != null) {
            ListNode tmp = secondHalfHead.next;
            ListNode t = index.next;
            secondHalfHead.next = index;
            index.next = tmp;
            index = t;
        }
        ListNode cur1 = head;
        ListNode cur2 = secondHalfHead.next;
        while (cur2 != null) {
            ListNode tmp1 = cur1.next;
            ListNode tmp2 = cur2.next;
            cur1.next = cur2;
            cur2.next = tmp1;
            cur1 = tmp1;
            cur2 = tmp2;
        }
    }
}
