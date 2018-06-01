import stuctures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by xueliang on 15-4-7.
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode flag = new TreeNode(0);
        TreeNode pre = root;
        TreeNode cur;
        queue.add(root);
        queue.add(flag);
        while (!queue.isEmpty()) {
            cur = queue.poll();
            if (cur == flag) {
                res.add(pre.val);
                if (!queue.isEmpty()) {
                    queue.add(flag);
                }
            }
            if (cur.left != null)
                queue.add(cur.left);
            if (cur.right != null)
                queue.add(cur.right);
            pre = cur;
        }
        return res;
    }
}
