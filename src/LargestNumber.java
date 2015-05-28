import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by xueliang on 15-4-2.
 */
public class LargestNumber {
    public String largestNumber(int[] num) {
        if (num == null || num.length == 0)
            return null;
        String[] tar = new String[num.length];
        for (int i = 0;i < num.length; i++) {
            tar[i] = String.valueOf(num[i]);
        }
        Arrays.sort(tar, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                for (int i = 0;i < s1.length(); i++) {
                    if (s1.charAt(i) < s2.charAt(i))
                        return 1;
                    else if (s1.charAt(i) > s2.charAt(i))
                        return -1;
                }
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder();
        if ("0".equals(tar[0]))
            return "0";
        for (int i = 0; i < tar.length; i++) {

            sb.append(tar[i]);
        }
        return sb.toString();
    }
}
