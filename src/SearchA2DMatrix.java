
public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = -1;
        int low = 0, high = n - 1;
        while (low <= high) {
        	int mid = low + (high - low) / 2;
        	if (matrix[mid][0] < target) {
        		row = mid;
        		low = mid + 1;
        	} else if (matrix[mid][0] > target) {
        		high = mid - 1;
        	} else {
        		return true;
        	}
        }
        if (row == -1) {
        	return false;
        }
        int left = 0, right = m - 1;
        while (left <= right) {
        	int mid = left + (right - left) / 2;
        	if (matrix[row][mid] < target) {
        		left = mid + 1;
        	} else if (matrix[row][mid] > target) {
        		right = mid - 1;
        	} else {
        		return true;
        	}
        }
        return false;
    }
}
