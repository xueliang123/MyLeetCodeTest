/**
 * Created by xueliang on 15-3-30.
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0)
            return null;
        return constructCore(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode constructCore (int[] preorder, int[] inorder, int preorderStart, int preorderEnd, int inorderStart, int inorderEnd) {
        int rootValue = preorder[preorderStart];
        TreeNode root = new TreeNode(rootValue);
        root.left = root.right = null;
        if (preorderStart == preorderEnd && inorderStart == inorderEnd)
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
            root.left = constructCore(preorder, inorder, preorderStart + 1, preorderStart + leftLength, inorderStart, index - 1);
        }
        if (rightLength > 0) {
            root.right = constructCore(preorder, inorder, preorderStart + leftLength + 1, preorderEnd, index + 1, inorderEnd);
        }
        return root;
    }
}
