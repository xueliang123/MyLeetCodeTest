/**
 * Created by xueliang on 15-3-19.
 */
public class Numberof1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0;i < 32;i++) {
            if (n < 0)
                count ++;
            n = n << 1;
        }
        return count;
    }
}
