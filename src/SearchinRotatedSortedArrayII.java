/**
 * Created by xueliang on 15-4-13.
 */
public class SearchinRotatedSortedArrayII {
    public boolean search(int[] A, int target) {
        if (A == null || A.length == 0)
            return false;
        int l = 0;
        int r = A.length - 1;
        while (l <= r) {
            int m = (l + r) >> 1;
            if (A[m] == target)
                return true;
            if (A[m] < A[l]) {
                if (target > A[m] && target <= A[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else if (A[m] > A[l]){
                if (target < A[m] && target >= A[l]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                l ++;
            }
        }
        return false;
    }
}
