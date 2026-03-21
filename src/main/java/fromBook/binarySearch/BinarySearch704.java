package fromBook.binarySearch;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] nums = new int[] {2,5};
        int target = 5;
        System.out.println(search(nums, target));
    }

    //brute force
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;

    }

    // БИНАРНЫЙ ПОИСК, решено с помощью ИИ
    public static int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int mid;
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
/**
 * РАЗБОР
 * Массив: [-1, 0, 3, 5, 9, 12]
 * Ищем 9.
 * left = 0, right = 5 → mid = 2 → nums[2] = 3.
 * Так как 3 < 9 → идём вправо → left = 3.
 * left = 3, right = 5 → mid = 4 → nums[4] = 9.
 * Совпадение → возвращаем 4. ✅
 *
 * 🔹 Сложность
 *
 * По времени: O(log n) (каждый шаг делим массив пополам).
 *
 * По памяти: O(1) (дополнительная память не нужна).
 * mid = 3 + (5 - 3) / 2
 * mid = 3 + 2 / 2
 * mid = 3 + 1
 * mid = 4
 *
 */
