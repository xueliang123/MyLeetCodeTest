
public class LowestCommonAncestorOfABinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pValue = p.val;
        int qValue = q.val;
        int low = Math.min(pValue, qValue);
        int large = Math.max(pValue, qValue);
        while (root != null) {
        	if (root.val > large) {
        		root = root.left;
        	} else if (root.val < low){
        		root = root.right;
        	} else {
        		return root;
        	}
        }
        return null;
    }
}
