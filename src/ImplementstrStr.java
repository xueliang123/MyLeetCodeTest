/**
 * Created by xueliang on 14-12-29.
 */
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        char[] tar = haystack.toCharArray();
        char[] nee = needle.toCharArray();
        boolean flag = true;
        if (nee.length == 0) {
            return 0;
        }
        for (int i = 0;i <= tar.length - nee.length;i++) {
            if (tar[i] == nee[0]) {
                int tmp = i;
                for (int j = 0;j < nee.length;j++) {
                    if (tar[tmp++] != nee[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    return i;
                flag = true;
            }
        }
        return -1;
    }
}
