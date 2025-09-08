package leetCode.repeat;

import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        rotate(array, k);
        System.out.println(Arrays.toString(array));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k -1);
        reverse(nums, k, nums.length - 1);

    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            //swap(nums[], nums[end]};
            int temp = nums[start];
            nums[start] = nums[end];
            start++;
            end--;
        }
    }
}
