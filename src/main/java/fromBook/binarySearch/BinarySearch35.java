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

/**
 * Момент с возвратом left.
 * Это хитрый трюк: если элемент не найден, то в конце left
 * стоит там, куда элемент логически вставился бы.
 * Подсказка:
 * Это всё тот же бинарный поиск, только:
 * Если nums[mid] == target → вернуть mid.
 * Если nums[mid] < target → нужно двигать левую границу (left = mid + 1).
 * Если nums[mid] > target → нужно двигать правую границу (right = mid - 1).
 * ⚡ Главное отличие:
 * Когда цикл завершится (left > right), правильный ответ — это индекс left.
 * Потому что:
 * left всегда "указывает" на место, куда вставить target.
 * Пример:
 * nums = [1,3,5,6], target = 2
 * mid = 1 → nums[mid]=3 > 2 → сдвигаем right.

 * left = 0, right = 0 → mid = 0 → nums[mid]=1 < 2 → сдвигаем left = 1.
 *
 * left = 1, right = 0 → цикл остановился.
 * 👉 Ответ = left = 1 (вставляем на индекс 1).
 * Итог:
 *
 * Time Complexity: O(log n)
 *
 * Space Complexity: O(1)
 */
}
