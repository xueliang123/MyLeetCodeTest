
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
        if (root == null) {
        	return null;
        }
        TreeNode left = null;
        TreeNode right = null;
        if (root.left != null) {
        	right = invertTree(root.left);
        }
        if (root.right != null) {
        	left = invertTree(root.right);
        }
        root.right = right;
        root.left = left;
        return root;
    }
}
