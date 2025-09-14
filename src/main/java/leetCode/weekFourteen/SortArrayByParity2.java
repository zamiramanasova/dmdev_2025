package leetCode.weekFourteen;

import java.util.Arrays;

public class SortArrayByParity2 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums1)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int evenIndex = 0;
        int oddIndex = 1;

        while (evenIndex < n && oddIndex < n) {
            if (nums[evenIndex] % 2 == 0) {
                evenIndex += 2;
            } else if (nums[oddIndex] % 2 == 1) {
                oddIndex += 2;
            } else {
                //swap
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[oddIndex];
                nums[oddIndex] = temp;
                evenIndex += 2;
                oddIndex += 2;
            }
        }
        return nums;
    }
    /**
     * Проверка результата
     *
     * Индекс 0 → 4 (чётное) ✅
     *
     * Индекс 1 → 5 (нечётное) ✅
     *
     * Индекс 2 → 2 (чётное) ✅
     *
     * Индекс 3 → 7 (нечётное) ✅
     *
     * Время: каждый элемент проверяется ограниченное число раз,
     * указатели движутся строго вправо по своим позициям ⇒ O(n).
     *
     * Память: делаем перестановки на месте,
     * используем лишь несколько переменных ⇒ O(1).
     */
}
