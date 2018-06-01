import stuctures.TreeNode;

import java.util.Stack;

public class LowestCommonAncestorOfABinaryTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();
        TreeNode res = null;
        if (findPath(root, p, pStack) && findPath(root, q, qStack)) {
        	while (!pStack.isEmpty()) {
        		TreeNode tmp = pStack.pop();
        		if (qStack.contains(tmp)) {
        			res = tmp;
        		} else {
        			break;
        		}
        	}
        }
        return res;
    }

	private boolean findPath(TreeNode root, TreeNode t, Stack<TreeNode> stack) {
		if (root == null) {
			return false;
		}
		if (root == t) {
			stack.push(root);
			return true;
		}
		if (findPath(root.left, t, stack) || findPath(root.right, t, stack)) {
			stack.push(root);
			return true;
		}
		return false;
	}
}
