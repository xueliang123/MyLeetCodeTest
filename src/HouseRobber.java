/**
 * Created by xueliang on 15-4-21.
 */
public class HouseRobber {
    public int rob(int[] num) {
        int i = 0;
        int e = 0;
        for (int v : num) {
            int tmp = i;
            i = v + e;
            e = Math.max(tmp, e);
        }
        return Math.max(i, e);
    }
}
