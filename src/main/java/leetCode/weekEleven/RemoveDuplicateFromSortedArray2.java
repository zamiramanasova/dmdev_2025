package leetCode.weekEleven;

public class RemoveDuplicateFromSortedArray2 {

    public static void main(String[] args) {
        int[] array = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(array));

    }

    public static int removeDuplicates(int[] nums) {
        int[] nums_copy = new int[nums.length];
        int num_unique_elements = nums.length;
        nums_copy[0] = nums[0];
        int pointer = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                num_unique_elements--;
            } else {
                nums_copy[pointer] = nums[i];
                pointer++;
            }
        }
        for (int i = 0; i < num_unique_elements; i++) {
            nums[i] = nums_copy[i];
        }
        return num_unique_elements;
    }
}
