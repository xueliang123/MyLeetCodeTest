import java.util.HashSet;
import java.util.Set;

/**
 * Created by xueliang on 14-12-11.
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        Set<Integer> result = sumSubTree(root);
        return result.contains(sum);
    }

    public Set<Integer> sumSubTree (TreeNode root) {
        Set<Integer> result = new HashSet<Integer>();
        if (root != null) {
            Set<Integer> tmp = new HashSet<Integer>();
            tmp.addAll(sumSubTree(root.left));
            tmp.addAll(sumSubTree(root.right));
            for (Integer i : tmp) {
                result.add(i + root.val);
            }
            if (result.size() == 0) {
                result.add(root.val);
            }
        }
        return result;
    }
}
