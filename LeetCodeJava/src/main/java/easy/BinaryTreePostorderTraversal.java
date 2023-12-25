package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        for (int e:postorderTraversal(root)) {
            System.out.print(e + " ");
        }
    }

    static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        postorder(root, arr);
        return arr;
    }

    private static void postorder(TreeNode root, List<Integer> arr) {
        if (root != null) {
            postorder(root.left, arr);
            postorder(root.right, arr);
            arr.add(root.val);
        }
    }
}
