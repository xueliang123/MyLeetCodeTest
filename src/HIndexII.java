
public class HIndexII {
	public int hIndex(int[] citations) {
        if (citations == null) {
        	return 0;
        }
        int res = 0;
        for (int i = 1; i <= citations.length; i++) {
        	if (i <= citations[citations.length - i]) {
        		res = i;
        	}
        }
        return res;
    }
}
