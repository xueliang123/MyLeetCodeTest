/**
 * Created by xueliang on 15-3-19.
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int res = 0;
        if(n == 1)
            return Integer.MIN_VALUE;
        for (int i = 0;i < 31;i++) {
            if ((n & 1) == 1)
                res |= 1;
            res <<= 1;
            n >>= 1;
        }
        if ((n & 1) == 1) {
            res |= 1;
        }
        return res;
    }
}
