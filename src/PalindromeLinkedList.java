public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
        }
        if (fast != null)
            slow = slow.next;
        ListNode l = new ListNode(0);
        l.next = null;
        while (slow != null) {
            ListNode tmp = slow;
            slow = slow.next;
            tmp.next = l.next;
            l.next = tmp;
        }
        l = l.next;
        while (head != null && l != null) {
            if (head.val != l.val)
                return false;
            head = head.next;
            l = l.next;
        }
        return true;
    }
}
