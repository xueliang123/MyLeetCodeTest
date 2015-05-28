/**
 * Created by xueliang on 15-4-15.
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode pre = head;

        while(p2 != null && p2.next != null){
            pre = p1;
            p1 = p1.next;
            p2 = p2.next.next;
        }
        pre.next = null;
        ListNode h1 = sortList(head);
        ListNode h2 = sortList(p1);
        return merge(h1, h2);
    }

    private ListNode merge(ListNode h1, ListNode h2) {
        if(h1 == null){
            return h2;
        }
        if(h2 == null){
            return h1;
        }
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (h1 != null && h2 != null) {
            if (h1.val > h2.val) {
                cur.next = h2;
                h2 = h2.next;
            } else {
                cur.next = h1;
                h1 = h1.next;
            }
            cur = cur.next;
        }
        if (h1 != null)
            cur.next = h1;
        if (h2 != null)
            cur.next = h2;
        return head.next;
    }
}
