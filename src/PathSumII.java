import java.util.LinkedList;
import java.util.List;

/**
 * Created by xueliang on 14-12-23.
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (root != null) {
            if (root.left != null || root.right != null) {
                int subSum = sum - root.val;
                if (root.left != null) {
                    List<List<Integer>> left = pathSum(root.left, subSum);
                    for (List<Integer> tmp : left) {
                        tmp.add(0,root.val);
                        result.add(tmp);
                    }
                }
                if (root.right != null) {
                    List<List<Integer>> right = pathSum(root.right, subSum);
                    for (List<Integer> tmp : right) {
                        tmp.add(0,root.val);
                        result.add(tmp);
                    }
                }
            } else {
                if (root.val == sum) {
                    List<Integer> tmp = new LinkedList<Integer>();
                    tmp.add(sum);
                    result.add(tmp);
                }
            }
        }
        return result;
    }
}
