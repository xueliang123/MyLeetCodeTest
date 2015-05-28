/**
 * Created by xueliang on 15-2-2.
 */
public class SortColors {
    public void sortColors(int[] A) {
        if (A == null)
            return;
        int low = 0;
        int high = A.length - 1;
        int i = 0;
        while (i <= high) {
            if (A[i] == 0) {
                A[i++] = A[low];
                A[low++] = 0;
            } else if (A[i] == 2) {
                A[i] = A[high];
                A[high--] = 2;
            } else {
                i++;
            }
        }
    }
}

