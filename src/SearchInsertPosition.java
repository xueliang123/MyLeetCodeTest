/**
 * Created by xueliang on 15-2-4.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
        int low = 0;
        int high = A.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (A[mid] < target) {
                low = mid + 1;
            } else if (A[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return A[low] < target ? low + 1 : low;
    }
}
