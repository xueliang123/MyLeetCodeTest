import stuctures.TreeNode;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] res = retrive(root);
        return Math.max(res[0], res[1]) - 1;
    }

    private int[] retrive(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] l = retrive(root.left);
        int[] r = retrive(root.right);
        return new int[]{Math.max(l[0], r[0]) + 1, Math.max(l[0] + r[0] + 1, Math.max(l[1], r[1]))};
    }
}
