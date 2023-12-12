package easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6}, target = 2;
        System.out.println(searchInsert(nums, target));
    }

    static int searchInsert(int[] nums, int target) {
        int size = nums.length, count = 0, position = 0;
        while (count < size) {
            if (nums[count] == target) {
                return count;
            }
            if (nums[count] < target) {
                position++;
            }
            count++;
        }
        return position;
    }
}
