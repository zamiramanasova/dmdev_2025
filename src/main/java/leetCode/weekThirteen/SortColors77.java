package leetCode.weekThirteen;

import java.util.Arrays;

/**
 * Given an array nums with n objects colored red,
 * white, or blue, sort them in-place so that objects
 * of the same color are adjacent, with the colors in
 * the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent
 * the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the
 * library's sort function.
 * Example 1:
 *
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Example 2:
 *
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 */
public class SortColors77 {
    public static void main(String[] args) {
        int[] nums = new int[] {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int minId = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minId = j;
                }
            }
            int temp = nums[i];
            nums[i] = min;
            nums[minId] = temp;
        }
    }
}
