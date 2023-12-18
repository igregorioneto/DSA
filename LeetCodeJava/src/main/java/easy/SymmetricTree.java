package easy;

import java.util.ArrayList;
import java.util.List;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        List<Integer> arr = new ArrayList<>();
        TreeNode.display(root, arr);

        for (int e:arr) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(isSymmetric(root));

    }

    static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return symmetric(root.left, root.right);
    }

    private static boolean symmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;

        if (left == null || right == null) return false;

        return left.val == right.val && symmetric(left.left, right.right) && symmetric(left.right, right.left);
    }
}
