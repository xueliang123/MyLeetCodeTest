/**
 * Created by xueliang on 15-4-16.
 */
public class BitwiseANDofNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        int r = Integer.MAX_VALUE;
        while((m & r) != (n & r)){
            r <<= 1;
        }
        return n & r;
    }
}
