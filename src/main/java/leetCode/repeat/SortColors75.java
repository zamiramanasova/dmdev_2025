package leetCode.repeat;

import java.util.Arrays;

public class SortColors75 {
    public static void main(String[] args) {
        int[] nums = new int[] {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int minId = i;
            for (int j = i + 1; j < nums.length; j++) {
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
