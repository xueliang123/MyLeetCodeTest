/**
 * Created by xueliang on 14-12-11.
 */
public class ZigZagConversion {
    public String convert(String s, int nRows) {
        char[] c = s.toCharArray();
        int length = c.length;
        StringBuilder[] sb = new StringBuilder[nRows];
        StringBuilder result = new StringBuilder();
        for (int i =0;i < nRows;i++){
            sb[i] = new StringBuilder();
        }
        int i = 0;
        while (i < length) {
            for (int sbi = 0;sbi < nRows && i < length;sbi++) {
                sb[sbi].append(c[i++]);
            }
            for (int sbi = nRows - 2;sbi > 0 && i < length;sbi--) {
                sb[sbi].append(c[i++]);
            }
        }
        for (StringBuilder tmp : sb) {
            result.append(tmp);
        }
        return result.toString();
    }
}
