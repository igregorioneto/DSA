package easy;

import java.util.List;

public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

    public static void display(TreeNode root, List<Integer> arr) {
        TreeNode current = root;
        displayOrderTreeNode(current, arr);
    }

    private static void displayOrderTreeNode(TreeNode current, List<Integer> arr) {
         if (current != null) {
             arr.add(current.val);
             displayOrderTreeNode(current.left, arr);
//             System.out.print(current.val);

             displayOrderTreeNode(current.right, arr);
         }
    }
}
