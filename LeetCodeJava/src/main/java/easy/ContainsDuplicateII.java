package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int nums[] = {1,0,1,1}, k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }

            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }

    static boolean containsNearbyDuplicate2(int[] nums, int k) {
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k)
                    return true;
            }
        }
        return false;
    }
}
