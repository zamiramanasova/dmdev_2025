package leetCode.weekFourteen;

import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
       int length = nums.length;
       int result[] = new int[length];
       for (int i = 0; i < length; i++) {
           result[(i + k) % length] = nums[i];
       }
       for (int i = 0; i < length; i++) {
           nums[i] = result[i];
       }
    }
}

