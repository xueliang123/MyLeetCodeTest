import java.util.HashMap;
import java.util.Map;

/**
 * Created by xueliang on 14-12-8.
 */
public class TwoSum {
    public int[] twoSum (int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
