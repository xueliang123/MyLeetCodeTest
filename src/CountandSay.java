/**
 * Created by 亮 on 2014/12/27.
 */
public class CountandSay {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        char[] tar = countAndSay(n - 1).toCharArray();
        StringBuilder sb = new StringBuilder();
        char tmp = tar[0];
        int count = 0;
        int index = 0;
        while (index < tar.length) {
            if (tar[index] == tmp) {
                count++;
            } else {
                sb.append(count);
                sb.append(tmp);
                count = 1;
                tmp = tar[index];
            }
            index++;
        }
        sb.append(count);
        sb.append(tmp);
        return sb.toString();
    }
}
