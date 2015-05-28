/**
 * Created by xueliang on 14-12-22.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char[] ac = a == null ? "0".toCharArray() : a.toCharArray();
        char[] bc = b == null ? "0".toCharArray() : b.toCharArray();
        int indexA = ac.length - 1;
        int indexB = bc.length - 1;
        boolean flag = false;
        while (indexA >= 0 && indexB >= 0) {
            if (flag) {
                if (ac[indexA] == '1' && bc[indexB] == '1') {
                    sb.append('1');
                    flag = true;
                } else if (ac[indexA] == '0' && bc[indexB] == '0') {
                    sb.append('1');
                    flag = false;
                } else {
                    sb.append('0');
                    flag = true;
                }
            } else {
                if (ac[indexA] == '1' && bc[indexB] == '1') {
                    sb.append('0');
                    flag = true;
                } else if (ac[indexA] == '0' && bc[indexB] == '0') {
                    sb.append('0');
                    flag = false;
                } else {
                    sb.append('1');
                    flag = false;
                }
            }
            indexA--;
            indexB--;
        }
        while (indexA >= 0) {
            if (flag) {
                if (ac[indexA] == '1') {
                    sb.append('0');
                    flag = true;
                }else {
                    sb.append('1');
                    flag = false;
                }
            } else {
               sb.append(ac[indexA]);
            }
            indexA--;
        }
        while (indexB >= 0) {
            if (flag) {
                if (bc[indexB] == '1') {
                    sb.append('0');
                    flag = true;
                }else {
                    sb.append('1');
                    flag = false;
                }
            } else {
                sb.append(bc[indexB]);
            }
            indexB--;
        }
        if (flag)
            sb.append('1');
        return sb.reverse().toString();
    }
}
