package leetCode.weekTen;

import java.util.*;

/**
 * При наличии непустого массива целых чисел каждый элемент
 * появляется дважды, кроме одного. Найдите тот самый.nums
 *
 * Необходимо реализовать решение с линейной сложностью
 * времени выполнения и использовать только постоянное
 * дополнительное пространство.
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] number = new int[] {1, 0, 1};
        int xor = 0;
        for (int x: number) {
            xor = xor ^ x;
        }
        System.out.println(xor);
    }
    // truth table
    // 0 ^ 0 = 0
    // 0 ^ 1 = 1
    // 1 ^ 0 = 1
    // 1 ^ 1 = 0
    // x ^ x = 0
    // x ^ 0 = x
}
