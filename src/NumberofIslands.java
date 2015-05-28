/**
 * Created by xueliang on 15-4-21.
 */
public class NumberofIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int n = grid.length;
        int m = grid[0].length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '0') {
                    continue;
                }
                res ++;
                deepFisrtSearch(i, j, grid);
            }
        }
        return res;
    }

    public void deepFisrtSearch (int x, int y, char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if (x < 0 || y < 0 || x == n || y == m)
            return;
        if (grid[x][y] == '1') {
            grid[x][y] = '0';
            deepFisrtSearch(x + 1, y, grid);
            deepFisrtSearch(x, y + 1, grid);
            deepFisrtSearch(x - 1, y, grid);
            deepFisrtSearch(x, y - 1, grid);
        }
    }
}
