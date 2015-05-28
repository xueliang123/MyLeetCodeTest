import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xueliang on 15-1-22.
 */
public class PopulatingNextRightPointersinEachNode {
    public void connect(TreeLinkNode root) {
        if (root == null)
            return;
        TreeLinkNode flag = new TreeLinkNode(0);
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);
        queue.add(flag);
        while (!queue.isEmpty()) {
            TreeLinkNode tar = queue.poll();
            TreeLinkNode ne = queue.peek();
            if (tar.left != null) {
                queue.add(tar.left);
            }
            if (tar.right != null) {
                queue.add(tar.right);
            }
            if (ne == flag) {
                tar.next = null;
                queue.poll();
                if (!queue.isEmpty()) {
                    queue.add(flag);
                }
                continue;
            }
            tar.next = ne;
        }
    }
}
