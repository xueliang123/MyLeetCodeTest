/**
 * Created by xueliang on 15-3-26.
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if (n == 0)
            return res;
        int count = 1;
        int lower = n - 1;
        int upper = 0;
        int left = 0;
        int right = n - 1;
        while (true) {
            if (left > right)
                break;
            for (int i = left;i <= right;i++) {
                res[upper][i] = count++;
            }
            upper ++;
            if (upper > lower)
                break;
            for (int i = upper;i <= lower;i++) {
                res[i][right] = count++;
            }
            right --;
            if (left > right)
                break;
            for (int i = right; i >= left;i--) {
                res[lower][i] = count++;
            }
            lower --;
            if (upper > lower)
                break;
            for (int i = lower; i >= upper;i--) {
                res[i][left] = count++;
            }
            left ++;
        }
        return res;
    }
}
