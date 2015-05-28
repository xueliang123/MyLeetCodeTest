
/**
 * Created by xueliang on 15-1-21.
 */
public class SingleNumber {
    public int singleNumber(int[] A) {
        int res = 0;
        for (int i : A) {
            res ^= i;
        }
        return res;
    }
}
