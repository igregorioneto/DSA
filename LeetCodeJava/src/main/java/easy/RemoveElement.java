package easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {2,2,3,3,4,3,2}, val = 3;
        int k = removeElement(nums, val);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
