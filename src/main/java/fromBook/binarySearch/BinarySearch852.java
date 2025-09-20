package fromBook.binarySearch;

public class BinarySearch852 {
    public static void main(String[] args) {
        int[] nums = new int[] {0,1,0};

        System.out.println(peakIndexInMountainArray(nums));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= arr[mid + 1]) {
                left = mid + 1; // ищем справа
            } else {
                right = mid - 1; // ищем слева
            }
        }
        return left;
    }
}
/**
 * Time Complexity: O(log N)
 * ✅ Space Complexity: O(1)
 */
