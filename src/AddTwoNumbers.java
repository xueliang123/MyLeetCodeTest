/**
 * Created by xueliang on 14-12-10.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean flag = false;
        ListNode result,tmp;
        int value;
        tmp = result = new ListNode(0);
        while (l1 != null && l2 != null) {
            value = l1.val + l2.val + (flag ? 1 : 0);
            if (value >= 10) {
                flag = true;
                value = value % 10;
            } else {
                flag = false;
            }
            tmp.next = new ListNode(value);
            tmp = tmp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            value = l1.val + (flag ? 1 : 0);
            if (value >= 10) {
                flag = true;
                value = value % 10;
            } else {
                flag = false;
            }
            tmp.next = new ListNode(value);
            tmp = tmp.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            value = l2.val + (flag ? 1 : 0);
            if (value >= 10) {
                flag = true;
                value = value % 10;
            } else {
                flag = false;
            }
            tmp.next = new ListNode(value);
            tmp = tmp.next;
            l2 = l2.next;
        }
        if (flag) {
            tmp.next = new ListNode(1);
        }
        return result.next;
    }
}
