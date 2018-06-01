import stuctures.TreeNode;

/**
 * Created by xueliang on 14-12-26.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null)
            return p == q;
        if (q == null)
            return q == p;
        if (p.val != q.val)
            return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
