import stuctures.TreeNode;

/**
 * Created by xueliang on 15-1-21.
 */
public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] num) {
        return creatSubTree(num,0,num.length - 1);
    }

    public TreeNode creatSubTree (int[] array, int start, int finish) {
        if (start > finish) {
            return null;
        }
        int mid = (start + finish) / 2;
        TreeNode t = new TreeNode(array[mid]);
        t.left = creatSubTree(array,start,mid - 1);
        t.right = creatSubTree(array,mid + 1,finish);
        return t;
    }
}
