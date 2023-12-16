package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = {4,0,0,0,0,0}, m = 1, nums2[] = {1,2,3,5,6}, n = 5;
        merge(nums1, m, nums2, n);
        for (int e:nums1) {
            System.out.print(e + " ");
        }
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;

        int size = nums1.length - m;
        for (int i = 0; i < n; i++) {
            nums1[m++] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
