package fromBook.binarySearch;

public class BinarySearch35 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2 ;

            if (nums[mid] == target) {
                return mid; //нашли число
            } else if (nums[mid] < target) {
                left = mid + 1; //ищем справа
            } else {
                right = mid - 1; //ищем слева
            }
        }
        // если не нашли, left показывает индекс для вставки
        return left;
    }

}
