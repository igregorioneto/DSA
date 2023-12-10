package easy;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        for (int e:runningSum(nums)) {
            System.out.print(e + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int sums[] = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int sum = sums[i - 1] + nums[i];
            sums[i] = sum;
        }
        return sums;
    }

    public static int[] runningSum2(int[] nums) {
        int sums[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < i + 1; j++) {
                sum += nums[j];
            }
            sums[i] = sum;
        }
        return sums;
    }
}
