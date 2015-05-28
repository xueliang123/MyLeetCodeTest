/**
 * Created by xueliang on 14-12-29.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] A) {
        int length = A.length;
        if (length == 0)
            return 0;
        int index = 1;
        for (int i = 1;i < length;i++) {
            while (i < length && A[i] == A[i - 1]) {
                i++;
            }
           if (i < length)
               A[index++] = A[i];
        }
        return index;
    }
}
