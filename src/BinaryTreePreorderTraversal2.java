import stuctures.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by xueliang on 15-1-30.
 */
public class BinaryTreePreorderTraversal2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (true) {
            res.add(root.val);
            if (root.right != null)
                stack.push(root.right);
            if (root.left != null) {
                root = root.left;
            } else {
                if (!stack.isEmpty()) {
                    root = stack.pop();
                } else {
                    break;
                }
            }
        }
        return res;
    }
}
