package easy;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> arr = new HashMap<>();

        for (int n: nums) {
            arr.put(n, arr.getOrDefault(n, 0) + 1);
        }
        for (int e:arr.keySet()) {
            if (arr.get(e) == 1) return e;
        }
        return 0;
    }
}
