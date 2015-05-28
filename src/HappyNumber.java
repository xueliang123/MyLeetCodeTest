import java.util.HashSet;
import java.util.Set;

/**
 * Created by xueliang on 15-4-22.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while (true) {
            int res = 0;
            while (n != 0) {
                int digit = n % 10;
                n /= 10;
                res += digit * digit;
            }
            if (res == 1)
                return true;
            else {
                if (set.contains(res))
                    return false;
                else
                    set.add(res);
                n = res;
            }
        }
    }
}
