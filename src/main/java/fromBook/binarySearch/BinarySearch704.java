package fromBook.binarySearch;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(search2(nums, target));
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

    // БИНАРНЫЙ ПОИСК, решено с помощью ИИ
    public static int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
