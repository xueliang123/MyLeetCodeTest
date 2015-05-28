/**
 * Created by xueliang on 14-12-8.
 */
public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        int lengthA = 0;
        int lengthB = 0;
        ListNode
                tmp,
                a = headA,
                b = headB;
        tmp = headA;
        while(tmp != null) {
            tmp = tmp.next;
            lengthA++;
        }
        tmp = headB;
        while(tmp != null) {
            tmp = tmp.next;
            lengthB++;
        }
        if(lengthA >= lengthB) {
            int count = lengthA - lengthB;
            while(count > 0) {
                a = a.next;
                count--;
            }
        } else {
            int count = lengthB - lengthA;
            while(count > 0) {
                b = b.next;
                count--;
            }
        }
        while (a != null && b != null) {
            if (a == b) {
                return a;
            } else {
                a = a.next;
                b = b.next;
            }
        }
        return null;
    }
}
