/**
 * Created by xueliang on 14-12-30.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int result = 0;
        int tmp = 5;
        while (tmp <= n) {
            result += n / tmp;
            tmp *= 5;
        }
        return result;
    }
}
