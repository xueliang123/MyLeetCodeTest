/**
 * Created by xueliang on 14-12-29.
 */
public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int length = A.length;
        for (int i = 0;i < length;i++) {
            while (A[i] == elem && i < length) {
                A[i] = A[--length];
            }
        }
        return length;
    }
}
