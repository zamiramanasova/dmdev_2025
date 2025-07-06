package leetCode.weekEleven;

/**
 *Условие задачи:
 * Дан массив nums и число val.
 * Нужно удалить все элементы, равные val, в том же массиве (in-place)
 * и вернуть число оставшихся элементов k.
 * Верните k.
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 */

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0; // куда будем писать подходящие элементы

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // сохраняем элемент
                k++;               // двигаем указатель
            }
        }

        return k;
        //Время: O(n)
        //
        //Память: O(1) — не создаём новых массивов
    }
}
