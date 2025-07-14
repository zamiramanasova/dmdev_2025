package leetCode.weekTwelve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Вам предоставляется целочисленный массив nums с индексом 0
 * и целочисленный pivot. Переставьте nums таким образом,
 * чтобы выполнялись следующие условия:
 *
 * Каждый элемент, меньший, чем pivot, появляется перед каждым
 * элементом, большим, чем pivot.
 * Каждый элемент, равный pivot, появляется между элементами,
 * меньшими и большими, чем pivot.
 * Сохраняется относительный порядок расположения элементов,
 * меньших, чем pivot, и элементов, превышающих pivot.
 * Более формально рассмотрим каждое значение pi, pj,
 * где pi - это новая позиция i-го элемента,
 * а pj - новая позиция j-го элемента. Если i < j и
 * оба элемента меньше (или больше) pivot, то pi < pj.
 * Верните номера после перестановки.
 */
public class PartitionArrayAccordingToGivenPivot {
    public static void main(String[] args) {
        int[] array = new int[] {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(array, pivot)));

    }

    public static int[] pivotArray(int[] nums, int pivot) {
        // Создаем три списка для хранения групп
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> more = new ArrayList<>();

        // 1. Распределяем элементы по группам
        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                more.add(num);
            }
        }
        // 2. Создаем новый массив для результата
        int[] result = new int[nums.length];
        int index = 0;

        // 3. Копируем элементы из трех списков
        for (int num : less) {
            result[index++] = num;
        }
        for (int num : equal) {
            result[index++] = num;
        }
        for (int num : more) {
            result[index++] = num;
        }
        return result;
    }
}
