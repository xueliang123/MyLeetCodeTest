import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by xueliang on 15-4-29.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null)
            return false;
        Map<Character, Character> map = new HashMap<Character, Character>(s.length());
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char from = s.charAt(i);
            char to = t.charAt(i);
            if (map.containsKey(from)) {
                char tmp = map.get(from);
                if (tmp != to) {
                    return false;
                }
            } else {
                if (set.contains(to)) {
                    return false;
                } else {
                    map.put(from, to);
                    set.add(to);
                }
            }
        }
        return true;
    }
}
