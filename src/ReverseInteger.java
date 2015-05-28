/**
 * Created by xueliang on 14-12-31.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int res = 0;
        int sign = x >= 0 ? 1 : -1;
        x = sign * x;
        while (x > 0) {
            int tmp = x % 10;
            if (Integer.MAX_VALUE / 10 < res || (Integer.MAX_VALUE - tmp) < res * 10)
                return 0;
            res = res * 10 + tmp;
            x /= 10;
        }
        return sign * res;
    }
}
