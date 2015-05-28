/**
 * Created by xueliang on 14-12-30.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs == null || strs.length == 0)
            return sb.toString();
        for (int i = 0;true;i++) {
            if (strs[0].length() <= i)
                return sb.toString();
            char tmp = strs[0].charAt(i);
            for (String s : strs) {
                if (s.length() <= i || s.charAt(i) != tmp) {
                    return sb.toString();
                }
            }
            sb.append(tmp);
        }
    }
}
