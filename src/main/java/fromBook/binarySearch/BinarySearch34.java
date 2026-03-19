package fromBook.binarySearch;

/**
 * Условие:
 * Дан отсортированный массив nums и число target.
 * Нужно найти первую и последнюю позицию target в массиве.
 * Если target нет, вернуть [-1, -1].
 * Примеры:
 * nums = [5,7,7,8,8,10], target = 8
 * ответ = [3,4]
 *
 * nums = [5,7,7,8,8,10], target = 6
 * ответ = [-1,-1]
 */
public class BinarySearch34 {
    public static void main(String[] args) {

    }
//    public int[] searchRange(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        int firstNumber = -1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) {
//                firstNumber = mid;
//                left = mid + 1;
//            //ищем справа
//            } else {
//                right = mid - 1; //ищем слева
//            }
//        }
//        return firstNumber;
//    }
}
