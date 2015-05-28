import java.util.ArrayList;
import java.util.List;

/**
 * Created by xueliang on 14-12-25.
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result;
        if (rowIndex == 0) {
            result = new ArrayList<Integer>();
            result.add(1);
            return result;
        }
        result = getRow(rowIndex - 1);
        int
                oldNum = 1,
                newNum;
        for (int i = 1;i < rowIndex;i++) {
            newNum = oldNum + result.get(i);
            oldNum = result.get(i);
            result.set(i, newNum);
        }
        result.add(1);
        return result;
    }
}
