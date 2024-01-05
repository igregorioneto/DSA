package easy;

import java.util.ArrayList;
import java.util.List;

public class CountCompleteTreeNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);

        List<Integer> arr = new ArrayList<>();
        TreeNode.display(root, arr);
        for (int e:arr) {
            System.out.print(e + " ");
        }

        System.out.println();

        System.out.println(countNodes(root));

    }

    static int countNodes(TreeNode root) {
        return root == null ? 0 : 1 + countNodes(root.left) + countNodes(root.right);
    }

}
