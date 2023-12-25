package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        for (int e:preorderTraversal(root)) {
            System.out.print(e + " ");
        }
    }

    static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        preorder(root, arr);
        return arr;
    }

    private static void preorder(TreeNode root, List<Integer> arr) {
        if (root != null) {
            arr.add(root.val);
            preorder(root.left, arr);
            preorder(root.right, arr);
        }
    }
}
