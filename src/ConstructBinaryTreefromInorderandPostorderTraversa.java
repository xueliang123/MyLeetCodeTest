/**
 * Created by xueliang on 15-3-31.
 */
public class ConstructBinaryTreefromInorderandPostorderTraversa {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0)
            return null;
        return constructCore(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode constructCore (int[] inorder, int[] postorder, int inorderStart, int inorderEnd, int postorderStart, int postorderEnd) {
        int rootValue = postorder[postorderEnd];
        TreeNode root = new TreeNode(rootValue);
        root.left = root.right = null;
        if (inorderStart == inorderEnd && postorderStart == postorderEnd)
            return root;
        int index = 0;
        for (int i = inorderStart; i <= inorderEnd; i++) {
            if (inorder[i] == rootValue) {
                index = i;
                break;
            }
        }
        int leftLength = index - inorderStart;
        int rightLength = inorderEnd - index;
        if (leftLength > 0) {
            root.left = constructCore(inorder, postorder, inorderStart, index - 1, postorderStart, postorderEnd - rightLength - 1);
        }
        if (rightLength > 0) {
            root.right = constructCore(inorder, postorder, index + 1, inorderEnd, postorderEnd - rightLength, postorderEnd - 1);
        }
        return root;
    }
}
