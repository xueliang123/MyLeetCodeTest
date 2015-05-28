/**
 * Created by xueliang on 15-2-2.
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode cur = head,
                lessHead = null,
                lessRear = null,
                greatHead = null,
                greatRear = null;
        while (cur != null) {
            if (cur.val < x) {
                if (lessHead == null) {
                    lessHead = cur;
                } else {
                    lessRear.next = cur;
                }
                lessRear = cur;
            } else {
                if (greatHead == null) {
                    greatHead = cur;
                } else {
                    greatRear.next = cur;
                }
                greatRear = cur;
            }
            cur = cur.next;
        }
        if (lessHead == null){
            return greatHead;
        }
        if (greatHead == null)
            return lessHead;
        lessRear.next = greatHead;
        greatRear.next = null;
        return lessHead;
    }
}
