package easy;

import java.util.ArrayList;
import java.util.List;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<Integer> arr = new ArrayList<>();
        TreeNode.display(root, arr);
        for (int e:arr) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(maxDepth(root));
    }

    static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}
