import stuctures.TreeNode;

/**
 * Created by xueliang on 14-12-17.
 */
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (root.left == null) {
            return r + 1;
        }
        if (root.right == null) {
            return l + 1;
        }
        return (l < r ? l : r) + 1;
    }
}
