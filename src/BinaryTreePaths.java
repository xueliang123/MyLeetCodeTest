import stuctures.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new LinkedList<>();
		if (root == null) {
			return res;
		}
		List<String> leftRes = binaryTreePaths(root.left);
		List<String> rightRes = binaryTreePaths(root.right);
		if (leftRes.size() == 0 && rightRes.size() == 0) {
			res.add(String.valueOf(root.val));
			return res;
		}
		if (leftRes.size() != 0) {
			for (String s : leftRes) {
				res.add(root.val + "->" + s);
			}
		}
		if (rightRes.size() != 0) {
			for(String s : rightRes) {
				res.add(root.val + "->" + s);
			}
		}
		return res;
	}
}
