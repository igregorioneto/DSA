package easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int nums[] = {0,2,3,4,6,8,9};
        for (String e:summaryRanges(nums)) {
            System.out.print(e + " ");
        }
    }

    static List<String> summaryRanges(int[] nums) {
        List<String> arr = new ArrayList<>();

        int i = 0, j = 0, n = nums.length;

        while (i < n) {
            j = i;
            while (j + 1 < n && (long)nums[j + 1] - nums[j] == 1) {
                j++;
            }

            if (i == j) {
                arr.add(String.valueOf(nums[i]));
                i++;
            } else {
                arr.add(String.valueOf(nums[i]) + "->" + String.valueOf(nums[j]));
                j++;
                i = j;
            }
        }

        return arr;
    }
}
