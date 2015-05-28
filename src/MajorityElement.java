import java.util.HashMap;
import java.util.Map;

/**
 * Created by xueliang on 14-12-22.
 */
public class MajorityElement {
    public int majorityElement(int[] num) {
        Map<Integer,Integer> result = new HashMap<Integer, Integer>();
        int length = num.length;
        for (int i : num) {
            if (result.containsKey(i)) {
                result.put(i,result.get(i) + 1);
            } else {
                result.put(i,1);
            }
            if (result.get(i) >= length / 2 + 1)
                return i;
        }
        return 0;
    }
}
