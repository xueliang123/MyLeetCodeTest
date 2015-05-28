/**
 * Created by xueliang on 15-2-3.
 */
public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] A) {
        int length = A.length;
        if (length == 0)
            return 0;
        int index = 1,
            count;
        for (int i = 1;i < length;i++) {
            count = 1;
            while (i < length && A[i] == A[i - 1]) {
                count++;
                if (count <= 2) {
                    A[index++] = A[i];
                }
                i++;
            }
            if (i < length)
                A[index++] = A[i];
        }
        return index;
    }
}
