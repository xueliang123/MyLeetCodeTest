import java.util.Stack;

/**
 * Created by xueliang on 15-1-26.
 */
public class BSTIterator {
    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return ! stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode res = stack.pop();
        TreeNode cur = res;
        if (cur.right != null) {
            cur = cur.right;
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
        }
        return res.val;
    }
}
