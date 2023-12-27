package easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    static int majorityElement(int[] nums) {
        int e = 0, majority = nums.length/2;
        HashMap<Integer, Integer> arr = new HashMap<>();

        for (int el:nums) {
            arr.put(el, arr.getOrDefault(el, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> el:arr.entrySet()) {
            if (arr.get(el.getKey()) > majority && arr.get(el.getKey()) > e) {
                e = el.getKey();
            }
        }


        return e;
    }
}
