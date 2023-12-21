package easy;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        List<Integer> arr = new ArrayList<>();
        TreeNode.display(root, arr);
        for (int e:arr) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(hasPathSum(root, 22));
    }

    static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return sumValuesTree(root, targetSum, 0);
    }

    private static boolean sumValuesTree(TreeNode root, int k, int sum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            sum += root.val;
            if (sum == k) {
                return true;
            }
        }

        boolean left = sumValuesTree(root.left, k, sum + root.val);
        boolean right = sumValuesTree(root.right, k, sum + root.val);

        return left || right;

    }
}
