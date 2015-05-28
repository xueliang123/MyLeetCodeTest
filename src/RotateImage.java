/**
 * Created by xueliang on 15-2-9.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        if (matrix == null)
            return;
        int n = matrix[0].length;
        for (int start = 0,finish = n - 1;start < finish;start++,finish--) {
            for (int i = start + 1;i < finish;i++) {
                int tmp;
                tmp = matrix[i][finish];
                matrix[i][finish] = matrix[start][i];
                matrix[start][i] = tmp;
                tmp = matrix[finish][start + finish - i];
                matrix[finish][start + finish - i] = matrix[start][i];
                matrix[start][i] = tmp;
                tmp = matrix[start + finish - i][start];
                matrix[start + finish - i][start] = matrix[start][i];
                matrix[start][i] = tmp;
            }
            int tmp;
            tmp = matrix[start][finish];
            matrix[start][finish] = matrix[start][start];
            matrix[start][start] = tmp;
            tmp = matrix[finish][finish];
            matrix[finish][finish] = matrix[start][start];
            matrix[start][start] = tmp;
            tmp = matrix[finish][start];
            matrix[finish][start] = matrix[start][start];
            matrix[start][start] = tmp;
        }
    }
}
