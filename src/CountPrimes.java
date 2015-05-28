import java.util.Arrays;

/**
 * Created by xueliang on 15-4-28.
 */
public class CountPrimes {
    public int countPrimes(int n) {
        if (n == 1)
            return 0;
        int res = 0;
        boolean[] tmp = new boolean[n];
        Arrays.fill(tmp, true);
        for (int i = 2; i < n; i++) {
            if (tmp[i]) {
                res ++;
                for (int j = 2; j * i < n; j++) {
                    tmp[j * i] = false;
                }
            }
        }
        return res;
    }
}
