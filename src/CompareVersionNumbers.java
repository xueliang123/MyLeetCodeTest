/**
 * Created by xueliang on 14-12-31.
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        for (String s : s1)
            System.out.print(s);
        int i = 0;
        for (;i < s1.length && i < s2.length;i++) {
            int m = Integer.parseInt(s1[i]);
            int n = Integer.parseInt(s2[i]);
            if (m > n)
                return 1;
            else if (m < n)
                return -1;
        }
        if (i < s1.length){
            for (;i < s1.length;i++){
                if (Integer.parseInt(s1[i]) != 0)
                    return 1;
            }
            return 0;
        }
        if (i < s2.length){
            for (;i < s2.length;i++){
                if (Integer.parseInt(s2[i]) != 0)
                    return -1;
            }
            return 0;
        }
        return 0;
    }
}
