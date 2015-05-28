/**
 * Created by xueliang on 15-4-14.
 */
public class SearchforaRange {
    public int[] searchRange(int[] A, int target) {
        int[] res = new int[]{-1, -1};
        if (A == null || A.length == 0)
            return res;
        int index = serchIndex(A, target, 0, A.length - 1);
        int beforeIndex, afterIndex;
        beforeIndex = afterIndex = index;
        while (beforeIndex != -1) {
           res[0] = beforeIndex;
           beforeIndex = serchIndex(A, target, 0, beforeIndex - 1);
        }
        while (afterIndex != -1) {
            res[1] = afterIndex;
            afterIndex = serchIndex(A, target, afterIndex + 1, A.length - 1);
        }
        return res;
    }

    public int serchIndex (int[] A, int target,int l, int r) {
        while (l <= r) {
            int m = (l + r) >> 1;
            if (A[m] > target) {
                r = m - 1;
            } else if (A[m] < target) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
