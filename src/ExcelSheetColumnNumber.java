/**
 * Created by xueliang on 14-12-29.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        char[] tar = s.toCharArray();
        int result = 0;
        for (int i = 0,j = tar.length - 1;i < tar.length;i++,j--) {
            result += (tar[i] - 'A' + 1) * Math.pow(26,j);
        }
        return result;
    }
}
