/**
 * Created by 亮 on 2014/12/27.
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] result = s.split(" ");
        int i = result.length;
        if (i > 0) {
            return result[i - 1].length();
        }
        return 0;
    }
}
