/**
 * Created by xueliang on 15-3-27.
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (matrix[mid][0] < target)
                low = mid + 1;
            else if (matrix[mid][0] > target)
                high = mid - 1;
            else
                return true;
        }
        if (high < 0)
            return false;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[high][mid] < target)
                left = mid + 1;
            else if (matrix[high][mid] > target)
                right = mid - 1;
            else
                return true;
        }
        return false;
    }
}
