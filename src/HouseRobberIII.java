import stuctures.TreeNode;

public class HouseRobberIII {
    public int rob(TreeNode root) {
        int[] tmp = testRob(root);
        return Math.max(tmp[0], tmp[1]);
    }

    private int[] testRob(TreeNode t) {
        int[] res = new int[2];
        if (t == null) {
            res[0] = 0;
            res[1] = 0;
        } else {
            int[] left = testRob(t.left);
            int[] right = testRob(t.right);
            res[0] = t.val + left[1] + right[1];
            res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        }
        return res;
    }
}
