public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int[][] tmp = new int[matrix.length][matrix[0].length];
        int maxlength = 0;
        for (int i = 0; i < matrix.length; i++) {
            tmp[i][0] = matrix[i][0] - '0';
            if (matrix[i][0] == '1') {
                maxlength = 1;
            }
        }
        for (int i = 1; i < matrix[0].length; i++) {
            tmp[0][i] = matrix[0][i] - '0';
            if (matrix[0][i] == '1') {
                maxlength = 1;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    tmp[i][j] = Math.min(tmp[i -1][j], Math.min(tmp[i - 1][j - 1], tmp[i][j - 1])) + 1;
                }
                maxlength = Math.max(maxlength, tmp[i][j]);
            }
        }
        return maxlength * maxlength;
    }
}
