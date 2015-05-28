/**
 * Created by xueliang on 15-3-31.
 */
public class ConvertSortedListtoBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = null;
        ListNode fast = null;
        ListNode pre = null;
        slow = fast = head;
        while (fast.next != null) {
            fast = fast.next;
            pre = slow;
            slow = slow.next;
            if (fast.next == null) {
                break;
            }
            fast = fast.next;
        }
        TreeNode root = new TreeNode(slow.val);
        if (pre != null){
            pre.next = null;
            root.left = sortedListToBST(head);
        }
        if (slow.next != null) {
            root.right = sortedListToBST(slow.next);
        }
        return root;
    }
}
