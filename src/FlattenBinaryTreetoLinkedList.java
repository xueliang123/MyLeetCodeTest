import java.util.Stack;

/**
 * Created by xueliang on 15-1-30.
 */
public class FlattenBinaryTreetoLinkedList {
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (true) {
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                root.right = root.left;
                root.left = null;
                root = root.right;
            } else {
                if (!stack.isEmpty()) {
                    root.right = stack.pop();
                    root = root.right;
                } else {
                    return;
                }
            }
        }
    }
}
