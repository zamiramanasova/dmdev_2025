package leetCode.weekThirteen;

import java.util.Arrays;

/**
 Вернуть квадрат элементов в массиве.
 */
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1; //позиция куда записывать след.макс квадрат

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        return result;

        //Построчное объяснение
        //⭐ int left = 0;
        //начало массива
        //
        //⭐ int right = n - 1;
        //конец массива
        //
        //⭐ pos = n - 1;
        //записываем самые большие квадраты с конца результата
        //while (left <= right)
        //— продолжаем пока указатели не пересеклись.
        //
        //✅ На каждом шаге:
        //
        //берём квадрат слева и справа
        //
        //сравниваем
        //
        //больший квадрат пишем в конец результата
        //
        //✅ Сдвигаем соответствующий указатель
        //работает за O(n)
        //⭐ не требует сортировки после квадратов
    }
}
