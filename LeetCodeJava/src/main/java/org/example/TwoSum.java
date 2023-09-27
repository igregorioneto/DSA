package org.example;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] r = twoSum(nums, 6);
        for (int n:r) {
            System.out.print(n + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
}
