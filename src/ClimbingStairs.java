/**
 * Created by 亮 on 2015/3/30.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int first = 1, second = 2, res = 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        for (int i = 3;i <= n;i++) {
            res = first + second;
            first = second;
            second  =res;
        }
        return res;
    }
}
