/**
 * Created by 亮 on 2014/12/27.
 */
public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            ListNode pre = head;
            ListNode tmp = head.next;
            head = null;
            ListNode index = null;
            int count = 1;
            while (tmp != null) {
                if (tmp.val == pre.val) {
                    count++;
                } else {
                    if (count == 1) {
                        if (head == null){
                            head = pre;
                            index = head;
                        } else {
                            index.next = pre;
                            index = pre;
                        }
                        index.next = null;
                    }
                    count = 1;
                }
                pre = tmp;
                tmp = tmp.next;
            }
            if (count == 1) {
                if (head == null){
                    head = pre;
                } else {
                    index.next = pre;
                }
            }
        }
        return head;
    }
}
