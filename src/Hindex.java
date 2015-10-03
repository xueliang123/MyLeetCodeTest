import java.util.Arrays;

public class Hindex {
	public int hIndex(int[] citations) {
        if (citations == null) {
        	return 0;
        }
        Arrays.sort(citations);
        int res = 0;
        for (int i = 1; i <= citations.length; i++) {
        	if (i <= citations[citations.length - i]) {
        		res = i;
        	}
        }
        return res;
    }
}
