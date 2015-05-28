/**
 * Created by xueliang on 15-1-19.
 */
public class FindPeakElement {
    public int findPeakElement(int[] num) {
        if (num.length == 1)
            return 0;
        for (int i = 0;i < num.length - 1;i++) {
            if (num[i] > num[i + 1])
                return i;
        }
        return num.length - 1;
    }
}
