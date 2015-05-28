import java.util.HashSet;
import java.util.Set;

/**
 * Created by xueliang on 15-3-31.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int length = s.length();
        char[] tmp = s.toCharArray();
        for (int i = 0;i < length;i ++) {
            Set<Character> check = new HashSet<Character>();
            check.add(tmp[i]);
            int count = 1;
            for (int j = i + 1;j < length; j ++) {
                char c = tmp[j];
                if (check.contains(c)) {
                    break;
                }
                check.add(c);
                count++;
            }
            res = res < count ? count : res;
        }
        return res;
    }
}
