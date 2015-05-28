import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by xueliang on 14-12-26.
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        List<TreeNode> oldRow = new ArrayList<TreeNode>();
        TreeNode
                tmp,
                magic = new TreeNode(0);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(magic);
        while (!queue.isEmpty()) {
            while ((tmp = queue.poll()) != magic) {
                if (tmp.left != null)
                    queue.add(tmp.left);
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
                oldRow.add(tmp);
            }
            for (int i = 0,j = oldRow.size() - 1;i <= j;i++,j--) {
                if (oldRow.get(i).val == oldRow.get(j).val) {
                    if (!((oldRow.get(i).left == null && oldRow.get(j).right == null) || (oldRow.get(i).left != null && oldRow.get(j).right != null))) {
                        return false;
                    }
                    if (!((oldRow.get(i).right == null && oldRow.get(j).left == null) || (oldRow.get(i).right != null && oldRow.get(j).left != null))) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (!queue.isEmpty()) {
                queue.add(magic);
                oldRow.clear();
            }
        }
        return true;
    }
}
