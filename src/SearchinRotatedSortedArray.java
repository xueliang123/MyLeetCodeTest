/**
 * Created by xueliang on 15-4-13.
 */
public class SearchinRotatedSortedArray {
    public int search(int[] A, int target) {
//        if (A == null || A.length == 0)
//            return -1;
//        int low = 0;
//        int high = A.length - 1;
//        int left, right;
//        int minIndex = 0;
//        if (A[low] > A[high]) {
//            while (low < high) {
//                int mid = (low + high) >> 1;
//                if (A[mid] > A[high]) {
//                    low = mid + 1;
//                } else {
//                    high = mid;
//                }
//            }
//            minIndex = low;
//        }
//        if (minIndex == 0) {
//            left = 0;
//            right = A.length - 1;
//        } else {
//            if (target >= A[minIndex] && target <= A[A.length - 1]) {
//                left = minIndex;
//                right = A.length - 1;
//            } else if (target >= A[0] && target <= A[minIndex - 1]) {
//                left = 0;
//                right = minIndex - 1;
//            } else {
//                return  -1;
//            }
//        }
//        while (left <= right) {
//            int mid = (left + right) >> 1;
//            if (A[mid] > target) {
//                right = mid - 1;
//            } else if (A[mid] < target) {
//                left = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;

        if (A == null || A.length == 0)
            return -1;
        int l = 0;
        int r = A.length - 1;
        while (l < r) {
            int m = (l + r) >> 1;
            if (A[m] < A[l]) {
                if (target >= A[m] && target <= A[r]) {
                    l = m;
                } else {
                    r = m - 1;
                }
            } else {
                if (target <= A[m] && target >= A[l]) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
        }
        if (A[l] == target)
            return l;
        else
            return  -1;
    }
}
