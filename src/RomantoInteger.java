/**
 * Created by xueliang on 14-12-30.
 */
public class RomantoInteger {
    public int romanToInt(String s) {
        char[] tar = s.toCharArray();
        int result = 0;
        for (int i = 0;i < tar.length;i++) {
            char tmp = tar[i];
            int j = i;
            int mid = 0;
            while (j < tar.length && tar[j++] == tmp) {
                mid += convert(tmp);
            }
            i = j - 1;
            if (convert(tar[i]) > convert(tmp)) {
                result = result + convert(tar[i]) - mid;
            } else if (convert(tar[i]) < convert(tmp)) {
                result += mid;
                i--;
            } else {
                result += mid;
            }
        }
        return result;
    }

    public int convert(char c) {
        switch (c) {
            case 'M' : return 1000;
            case 'D' : return 500;
            case 'C' : return 100;
            case 'L' : return 50;
            case 'X' : return 10;
            case 'V' : return 5;
            case 'I' : return 1;
            default : return 0;
        }
    }
}
