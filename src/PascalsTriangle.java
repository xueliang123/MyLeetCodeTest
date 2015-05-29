import java.util.ArrayList;
import java.util.List;

/**
 * Created by 亮 on 2014/12/9.
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows > 0) {
            List<Integer> tmp = new ArrayList<Integer>();
            tmp.add(new Integer(1));
            result.add(tmp);
            for(int i = 1;i < numRows;i++) {
                List<Integer> row = new ArrayList<Integer>();
                row.add(new Integer(1));
                for(int j = 1;j < i;j++) {
                    row.add(tmp.get(j - 1).intValue() + tmp.get(j).intValue());
                }
                row.add(new Integer(1));
                result.add(row);
                tmp = row;
            }
        }
        return result;
    }
}
