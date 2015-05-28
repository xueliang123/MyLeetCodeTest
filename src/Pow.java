/**
 * Created by xueliang on 15-4-17.
 */
public class Pow {
    public double pow(double x, int n) {
        if (n == 0)
            return 1.0;
        if (n < 0) {
            x = 1.0 / x;
            n *= -1;
        }
        double res = pow(x, n >> 1);
        res *= res;
        if ((n & 1) == 1) {
            res *= x;
        }
        return res;
    }
}
