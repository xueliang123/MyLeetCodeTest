/**
 * Created by xueliang on 14-12-26.
 */
public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        int
                i = 0,
                j = 0,
                index = 0,
                count = m;
        while (index < m && j < n) {
            if (A[i] <= B[j]) {
                i++;
                index++;
            } else {
                for (int k = count;k > i;k--) {
                    A[k] = A[k - 1];
                }
                A[i] = B[j];
                i++;
                j++;
                count++;
            }
        }
        if (index >= m) {
            while (j < n) {
                A[i++] = B[j++];
            }
        }
    }
}