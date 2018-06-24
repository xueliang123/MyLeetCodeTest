import java.util.Arrays;

public class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
        int[][] res = new int[people.length][];
        Arrays.sort(people, (o1, o2) -> {
            if (o1[0] < o2[0]) {
                return -1;
            } else if (o1[0] > o2[0]) {
                return 1;
            } else {
                return Integer.compare(o2[1], o1[1]);
            }
        });
        int[] tmp = new int[people.length];
        for (int i = 0; i < people.length; i++) {
            tmp[i] = people[i][1];
        }
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length; j++) {
                tmp[j]--;
                if (tmp[j] == -1) {
                    res[i] = people[j];
                    break;
                }
            }
        }
        return res;
    }
}
