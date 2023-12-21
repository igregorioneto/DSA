package easy;

import java.util.ArrayList;
import java.util.List;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode();
        root.right = new TreeNode(3);
        root.left.left = new TreeNode();
        root.left.left.left = new TreeNode();
        root.left.left.right = new TreeNode(6);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode();
        root.right.right = new TreeNode(5);

        List<Integer> arr = new ArrayList<>();
        TreeNode.display(root, arr);
        for (int e:arr) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(minDepth(root));
    }

    static int minDepth(TreeNode root) {
        if (root == null) return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0 || right == 0) {
            return left + right + 1;
        }

        return Math.min(left, right) + 1;
    }
}
