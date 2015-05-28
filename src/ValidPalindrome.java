/**
 * Created by xueliang on 15-1-20.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll(" ","").replaceAll("\\pP|\\pS","").toLowerCase();
        for (int i = 0, j = s.length() - 1;i < j;i++,j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
