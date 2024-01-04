package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int e:nums) {
            if (arr.containsKey(e) && arr.get(e) >= 1)
                return true;
            arr.put(e, arr.getOrDefault(e, 0) + 1);
        }
        return false;
    }

    static boolean containsDuplicate2(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    static boolean containsDuplicate3(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int e:nums) {
            if (!arr.contains(e)) {
                arr.add(e);
            } else {
                return true;
            }
        }
        return false;
    }
}
