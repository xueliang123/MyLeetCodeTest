/**
 * Created by xueliang on 15-4-10.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] A) {
        int max = A[0];
        int curSum = A[0];
        for (int i = 1; i < A.length; i++) {
            curSum = A[i] + (curSum > 0 ? curSum : 0);
            max = Math.max(max, curSum);
        }
        return max;
    }
}
