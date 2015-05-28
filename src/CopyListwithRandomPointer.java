/**
 * Created by xueliang on 15-4-16.
 */
public class CopyListwithRandomPointer {
    class RandomListNode {
             int label;
             RandomListNode next, random;
             RandomListNode(int x) { this.label = x; }
         }

    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode cur = head;
        RandomListNode res = new RandomListNode(0);
        RandomListNode pre = res;
        while (cur != null) {
            RandomListNode newNode = new RandomListNode(cur.label);
            RandomListNode tmp = cur.next;
            cur.next = newNode;
            newNode.next = tmp;
            cur = tmp;
        }
        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            } else {
                cur.next.random = null;
            }
            cur = cur.next.next;
        }
        cur = head;
        while (cur != null) {
            pre.next = cur.next;
            RandomListNode tmp = cur;
            cur = cur.next.next;
            pre = pre.next;
            tmp.next = cur;
        }
        return res.next;
    }
}
