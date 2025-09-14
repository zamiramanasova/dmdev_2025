package leetCode.weekFourteen;

import java.util.Arrays;

public class SortColors75 {
    public static void main(String[] args) {
        int[] nums = new int[] {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int zeroInsertPosition = 0;
        int twoInsertPos = nums.length - 1;
        int i = 0;

        while (i <= twoInsertPos) {
            if (nums[i] == 0) {
               swap(nums, zeroInsertPosition, i);
               zeroInsertPosition++;
               i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, twoInsertPos);
                twoInsertPos--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
/**
 * Время работы
 *
 * Каждый элемент массива обрабатывается не более одного раза
 * (хотя на 2 мы можем сделать swap и снова посмотреть на этот
 * элемент, но это всё равно максимум 1–2 раза).
 *
 * То есть итоговая асимптотика:
 *
 * 𝑂(𝑛)
 * O(n)
 * где n — длина массива.
 *
 * 💾 Память
 *
 * Используются только:
 *
 * три целых переменных (zeroInsertPosition, twoInsertPos, i),
 *
 * временная переменная temp в swap.
 *
 * Никакой дополнительной структуры данных не создаётся.
 *
 * ✅ Ответ:
 *
 * Время: O(n)
 *
 * Память: O(1)
 */
