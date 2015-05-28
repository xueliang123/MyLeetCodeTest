/**
 * Created by xueliang on 14-12-15.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int l = height(root.left);
        int r = height(root.right);
        if (l - r <= 1 && l - r >= -1) {
            return isBalanced(root.left) && isBalanced(root.right);
        } else {
            return false;
        }
    }
    public int height (TreeNode t) {
        if (t == null) {
            return 0;
        } else {
            int l = height(t.left);
            int r = height(t.right);
            return (l > r ? l : r) + 1;
        }
    }
}
