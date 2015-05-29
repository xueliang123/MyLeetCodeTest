/**
 * Created by 亮 on 2014/12/26.
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            ListNode index = head.next;
            ListNode pre = head;
            while (index != null) {
                if (index.val == pre.val) {
                    pre.next = index.next;
                } else {
                    pre = index;
                }
                index = pre.next;
            }
        }
        return head;
    }
}
