package easy;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        int nums[] = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);

        List<Integer> arr = new ArrayList<>();
        TreeNode.display(root, arr);

        for (int e:arr) {
            System.out.print(e + " ");
        }
    }

    static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) return new TreeNode(nums[0]);
        if (nums.length == 0) return null;
        int half = nums.length / 2;
        TreeNode root = new TreeNode(nums[half]);

        int left[] = new int[half];
        int i = 0;

        while (i < half) {
            left[i] = nums[i];
            i++;
        }

        int right[] = new int[nums.length - left.length - 1];
        int j = 0;
        i++;
        while (i < nums.length) {
            right[j] = nums[i];
            i++;
            j++;
        }

        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);

        return root;
    }

    static TreeNode sortedArrayToBST2(int[] nums) {
        if (nums.length == 1) return new TreeNode(nums[0]);
        if (nums.length == 0) return null;
        int half = nums.length / 2;
        TreeNode root = new TreeNode(nums[half]);
        int[] left = new int[half];
        int i = 0;
        for (; i < half; i++) {
            left[i] = nums[i];
        }
        i++;
        int[] right = new int[nums.length - left.length - 1];
        for (int j = 0; i < nums.length ; j++) {
            right[j] = nums[i];
            i++;
        }

        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);

        return root;
    }
}
