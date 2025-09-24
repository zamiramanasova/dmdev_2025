package fromBook.binarySearch;

/**
 * Binary Search
 * Solved
 * You are given an array of distinct integers nums,
 * sorted in ascending order, and an integer target.
 *
 * Implement a function to search for target within nums.
 * If it exists, then return its index, otherwise, return -1.
 *
 * Your solution must run in
 * O(logn) time.
 *
 * Example 1:
 *
 * Input: nums = [-1,0,2,4,6,8], target = 4
 *
 * Output: 3
 */
public class NeetCode150 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,2,4,6,8};
        int target = 4;

    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
