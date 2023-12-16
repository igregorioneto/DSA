package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> arr = new ArrayList<>();
        //TreeNode.display(root, arr);

        for (int e:inorderTraversal(root)) {
            System.out.print(e + " ");
        }
    }

    static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        displayOrderTreeNode(root, arr);
        return arr;
    }

    private static void displayOrderTreeNode(TreeNode current, List<Integer> arr) {
        if (current != null) {
            displayOrderTreeNode(current.left, arr);
            arr.add(current.val);
            displayOrderTreeNode(current.right, arr);
        }
    }
}
