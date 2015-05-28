/**
 * Created by xueliang on 15-1-22.
 */
public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] num) {
//    第一种解法
//        for (int i : num) {
//            if (i < num[0])
//                return i;
//        }
//        return num[0];


//        二分查找法
        int l = 0;
        int r = num.length - 1;
        while (l != r) {
            int mid = (l + r) >> 1;
            if (num[mid] > num[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return num[l];
    }
}
