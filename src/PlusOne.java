/**
 * Created by xueliang on 15-1-20.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int a = 1,b;
        for (int i = digits.length - 1;i >= 0;i--) {
            int tmp = digits[i] + a;
            a = tmp / 10;
            b = tmp % 10;
            digits[i] = b;
        }
        if (a == 0) {
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1;i < result.length;i++)
                result[i] = 0;
            return result;
        }
    }
}
