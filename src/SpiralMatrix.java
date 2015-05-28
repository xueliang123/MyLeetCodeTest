import java.util.ArrayList;
import java.util.List;

/**
 * Created by xueliang on 15-3-26.
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0)
            return res;
        int lower = matrix.length - 1;
        int right = matrix[0].length - 1;
        int upper = 0;
        int left = 0;
        while (true) {
            if (left > right)
                break;
            for (int i = left;i <= right;i++) {
                res.add(matrix[upper][i]);
            }
            upper ++;
            if (upper > lower)
                break;
            for (int i = upper;i <= lower;i++) {
                res.add(matrix[i][right]);
            }
            right --;
            if (left > right)
                break;
            for (int i = right; i >= left;i--) {
                res.add(matrix[lower][i]);
            }
            lower --;
            if (upper > lower)
                break;
            for (int i = lower; i >= upper;i--) {
                res.add(matrix[i][left]);
            }
            left ++;
        }
        return res;
    }
}
