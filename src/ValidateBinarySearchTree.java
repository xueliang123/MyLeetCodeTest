import stuctures.TreeNode;

import java.util.Stack;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode t = root, c = null;
        while (!s.isEmpty() || t != null) {
            while (t != null) {
                s.push(t);
                t = t.left;
            }
            if (!s.isEmpty()) {
                t = s.pop();
                if (c == null) {
                    c = t;
                } else {
                    if (c.val >= t.val) {
                        return false;
                    }
                    c = t;
                }

                t = t.right;
            }
        }
        return true;
    }
}
