/**
 * Created by 亮 on 2015/4/28.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length - 1;
        int n = grid[0].length - 1;
        for (int i = m - 1; i >= 0; i--) {
            grid[i][n] += grid[i + 1][n];
        }
        for (int i = n - 1; i >= 0; i--) {
            grid[m][i] += grid[m][i + 1];
        }
        if (m == 0 || n == 0) {
            return grid[0][0];
        }
        while (true) {
            if (m > 0)
                m--;
            if (n > 0)
                n--;
            if (m == 0 || n == 0) {
                grid[m][n] += Math.min(grid[m + 1][n], grid[m][n + 1]);
                for (int i = m - 1; i >= 0; i--) {
                    grid[i][n] += Math.min(grid[i + 1][n], grid[i][n + 1]);
                }
                for (int i = n - 1; i >= 0; i--) {
                    grid[m][i] += Math.min(grid[m + 1][i], grid[m][i + 1]);
                }
                break;
            }
            grid[m][n] += Math.min(grid[m + 1][n], grid[m][n + 1]);
            for (int i = m - 1; i >= 0; i--) {
                grid[i][n] += Math.min(grid[i + 1][n], grid[i][n + 1]);
            }
            for (int i = n - 1; i >= 0; i--) {
                grid[m][i] += Math.min(grid[m + 1][i], grid[m][i + 1]);
            }
        }
        return grid[0][0];
    }
}
