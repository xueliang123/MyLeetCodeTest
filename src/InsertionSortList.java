/**
 * Created by xueliang on 15-3-25.
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode res = new ListNode(0);
        while (head != null) {
            ListNode pre = res;
            ListNode cur = res.next;
            while (cur != null) {
                if (head.val > cur.val) {
                    cur = cur.next;
                    pre = pre.next;
                    continue;
                }
                break;
            }
            ListNode tmp = head.next;
            pre.next = head;
            head.next = cur;
            head = tmp;
        }
        return res.next;
    }
}
