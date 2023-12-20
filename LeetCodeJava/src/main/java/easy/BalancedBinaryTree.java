package easy;

import java.util.ArrayList;
import java.util.List;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode();
        root.left.right = new TreeNode();
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<Integer> arr = new ArrayList<>();
        TreeNode.display(root, arr);

        for (int e:arr) {
            System.out.print(e + " ");
        }

        System.out.println();

        System.out.println(isBalanced(root));
    }

    static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int heightDiff = Math.abs(valueBalanced(root.left) - valueBalanced(root.right));
        if (heightDiff > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int valueBalanced(TreeNode root) {
        if (root == null) return 0;

        return Math.max(valueBalanced(root.left), valueBalanced(root.right)) + 1;
    }
}
