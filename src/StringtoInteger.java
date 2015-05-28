/**
 * Created by xueliang on 15-4-23.
 */
public class StringtoInteger {
    public int myAtoi(String str) {
        if (str == null)
            return 0;
        int res = 0;
        char[] tar = str.toCharArray();
        boolean isFirstPosition = true;
        int sign = 1;
        for (int i = 0; i < tar.length; i++) {
            if (tar[i] == ' ') {
                if (isFirstPosition) {
                    continue;
                } else {
                    return res * sign;
                }
            }
            if (tar[i] > '9' || tar[i] < '0') {
                if (isFirstPosition) {
                    switch (tar[i]) {
                        case '+' : break;
                        case '-' : sign = -1; break;
                        default : return 0;
                    }
                } else {
                    return res * sign;
                }
            } else {
                int digit = tar[i] - '0';
                int tmp = sign * res;
                if (tmp > 0) {
                    if (Integer.MAX_VALUE / 10 < tmp || (Integer.MAX_VALUE - digit) < tmp * 10) {
                        return Integer.MAX_VALUE;
                    }
                } else {
                    if (Integer.MIN_VALUE / 10 > tmp || (Integer.MIN_VALUE + digit) > tmp * 10) {
                        return Integer.MIN_VALUE;
                    }
                }

                res = res * 10 + digit;
            }
            if (isFirstPosition)
                isFirstPosition = false;
        }
        return sign * res;
    }
}
