import stuctures.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by 亮 on 2015/5/3.
 */
public class BinaryTreePostorderTraversal2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode t = stack.pop();
            res.add(0, t.val);
            if (t.left != null)
                stack.push(t.left);
            if (t.right != null)
                stack.push(t.right);
        }
        return res;
    }
}
