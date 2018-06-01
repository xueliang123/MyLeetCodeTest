import stuctures.TreeNode;

/**
 * Created by xueliang on 14-12-25.
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return (l > r ? l : r) + 1;
    }
}
