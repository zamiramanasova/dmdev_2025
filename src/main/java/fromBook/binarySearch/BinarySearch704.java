package fromBook.binarySearch;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(search(nums, target));
    }

    //brute force
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                i++;
            } else {
                return i;
            }
        }
        return -1;

    }
}
