import java.util.*;

/**
 * Created by xueliang on 15-3-24.
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(root);
            TreeNode flag = new TreeNode(0);
            queue.add(flag);
            int levelNum = 0;
            Stack<TreeNode> stack = new Stack<TreeNode>();
            List<Integer> list = new ArrayList<Integer>();
            while (!queue.isEmpty()) {
                TreeNode tmp = queue.poll();
                if (levelNum % 2 == 1) {
                    if (tmp == flag) {
                        List<Integer> levelList = new ArrayList<Integer>();
                        while (!stack.isEmpty()) {
                            levelList.add(stack.pop().val);
                        }
                        res.add(levelList);
                        if (!queue.isEmpty()) {
                            queue.add(flag);
                        }
                        levelNum ++;
                        continue;
                    }
                    stack.push(tmp);
                } else  {
                    if (tmp == flag) {
                        res.add(list);
                        if (!queue.isEmpty()) {
                            queue.add(flag);
                            list = new ArrayList<Integer>();
                        }
                        levelNum ++;
                        continue;
                    }
                    list.add(tmp.val);
                }
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
        }
        return res;
    }
}
