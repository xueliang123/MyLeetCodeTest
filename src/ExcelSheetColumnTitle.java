/**
 * Created by xueliang on 14-12-22.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        int i = (n - 1) / 26;
        int j = (n - 1) % 26;
        while (i >= 1) {
            sb.append((char)('A' + j));
            j = (i - 1) % 26;
            i = (i - 1) / 26;
        }
        sb.append((char)('A' + j));
        return sb.reverse().toString();
    }
}
