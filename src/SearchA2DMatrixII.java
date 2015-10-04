
public class SearchA2DMatrixII {
	public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        return find(matrix, 0, m - 1, target);
    }

	private boolean find(int[][] matrix, int i, int j, int target) {
		// TODO Auto-generated method stub
		if (i >= matrix.length || j < 0) {
			return false;
		}
		if (matrix[i][j] < target) {
			return find(matrix, i + 1, j, target);
		} else if (matrix[i][j] > target) {
			return find(matrix, i, j - 1, target);
		} else {
			return true;
		}
	}
}
