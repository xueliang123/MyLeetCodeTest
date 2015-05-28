/**
 * Created by xueliang on 15-4-10.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] A) {
        int max = 0;
        int curSum = 0;
        for (int i = 0; i < A.length; i++) {
            curSum += A[i];
            if (curSum <= 0) {
                curSum = 0;
                continue;
            }
            max = max > curSum ? max : curSum;
        }
        if (max == 0) {
            max = A[0];
            for (int i = 1; i < A.length; i++) {
                max = max > A[i] ? max : A[i];
            }
        }
        return max;
    }
}
