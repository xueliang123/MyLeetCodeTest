import stuctures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by xueliang on 14-12-25.
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            TreeNode flag = new TreeNode(0);
            queue.add(root);
            queue.add(flag);
            TreeNode i;
            List<Integer> tmp = new ArrayList<Integer>();
            while (!queue.isEmpty()) {
                i = queue.poll();
                if (i == flag) {
                    result.add(0,tmp);
                    if (!queue.isEmpty()) {
                        tmp = new ArrayList<Integer>();
                        queue.add(flag);
                    }
                    continue;
                }
                tmp.add(i.val);
                if (i.left != null) {
                    queue.add(i.left);
                }
                if (i.right != null) {
                    queue.add(i.right);
                }
            }
        }
        return result;
    }
}
