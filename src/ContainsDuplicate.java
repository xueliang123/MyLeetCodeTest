import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2015/5/28.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null)
            return true;
        Set<Integer> set = new HashSet<>();
        for (int tmp : nums) {
            if (set.contains(tmp)) {
                return true;
            } else {
                set.add(tmp);
            }
        }
        return false;
    }
}
