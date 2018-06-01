import stuctures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xueliang on 15-1-22.
 */
public class BinaryTreePostorderTraversal1 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root != null) {
            result.addAll(postorderTraversal(root.left));
            result.addAll(postorderTraversal(root.right));
            result.add(root.val);
        }
        return result;
    }
}
