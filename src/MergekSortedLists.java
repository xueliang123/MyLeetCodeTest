import java.util.List;

/**
 * Created by xueliang on 15-4-15.
 */
public class MergekSortedLists {
    public ListNode mergeKLists(List<ListNode> lists) {
        ListNode res = new ListNode(0);
        ListNode cur = res;
        if (lists == null)
            return res.next;
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i) == null){
                lists.remove(i);
                i--;
            }
        }
        int size = lists.size();
        if (size == 0)
            return res.next;
        for (int i = (size - 1) >> 1; i >= 0; i--) {
            heapAdjust(lists, i, size);
        }
        while (size > 1) {
            cur.next = lists.get(0);
            cur = lists.get(0);
            if (cur.next != null) {
                lists.set(0, cur.next);
            } else {
                size --;
                lists.set(0, lists.get(size));
            }
            heapAdjust(lists, 0, size);
        }
        cur.next = lists.get(0);
        return res.next;
    }

    public void heapAdjust (List<ListNode> heap, int tar, int size) {
        ListNode temp = heap.get(tar);
        for (int i = tar * 2 + 1; i < size; i = i * 2 + 1) {
            if (i + 1 < size && heap.get(i).val > heap.get(i + 1).val) {
                i ++;
            }
            if (temp.val <= heap.get(i).val) {
                break;
            }
            heap.set(tar, heap.get(i));
            tar = i;
        }
        heap.set(tar, temp);
    }
}
