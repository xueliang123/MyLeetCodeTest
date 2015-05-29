/**
 * Created by 亮 on 2015/4/7.
 */
public class ReverseWordsinaString {
    public String reverseWords(String s) {
        StringBuilder rslt = new StringBuilder();
        int i = s.length(), j = s.length();
        while(--i >= -1){
            if(i==-1 || s.charAt(i) == ' '){
                if(i+1!=j && rslt.length()!=0) rslt.append(" ");
                rslt.append(s.substring(i+1,j));
                j = i;
            }
        }
        return rslt.toString();
    }
}
