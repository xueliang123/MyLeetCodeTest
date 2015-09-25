import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
        	return false;
        }
        Map<Character, Integer> res = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if (res.containsKey(c)) {
        		res.put(c, res.get(c) + 1);
        	} else {
        		res.put(c, 1);
        	}
        }
        for (int i = 0; i < t.length(); i++) {
        	char c = t.charAt(i);
        	if (res.containsKey(c)) {
        		res.put(c, res.get(c) - 1);
        	} else {
        		return false;
        	}
        }
        for (Map.Entry<Character, Integer> entry : res.entrySet()) {
        	if (entry.getValue() != 0) {
        		return false;
        	}
        }
        return true;
    }
}
