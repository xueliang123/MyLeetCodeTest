/**
 * Created by 亮 on 2015/4/24.
 */
public class BitDiff {
    public static int countBitDiff(int m, int n) throws Exception {
        // 请在此添加代码
        int res = 0;
        int tmp = m ^ n;
        while (tmp != 0) {
            tmp &= (tmp - 1);
            res ++;
        }
        return res;
    }
}
