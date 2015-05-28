/**
 * Created by xueliang on 14-12-10.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else if (x % 10 == 0) {
            return false;
        }
        int y = 0;
        while (y < x) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        if (x == y || y / 10 == x) {
            return true;
        } else {
            return false;
        }
    }
}
