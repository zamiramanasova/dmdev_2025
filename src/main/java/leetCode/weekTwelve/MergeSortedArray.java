package leetCode.weekTwelve;

import java.util.Arrays;

/**
 * Вам даны два целочисленных массива nums1 и nums2,
 * отсортированных в порядке неубывания, и два целых числа m и n,
 * представляющие количество элементов в nums1 и nums2 соответственно.
 *
 * Объедините nums1 и nums2 в единый массив,
 * отсортированный в порядке убывания.
 *
 * Конечный отсортированный массив не должен быть
 * возвращен функцией, а должен храниться внутри массива nums1.
 * Чтобы учесть это, nums1 имеет длину m + n, где первые m элементов
 * обозначают элементы, которые должны быть объединены, а последние n
 * элементов имеют значение 0 и должны игнорироваться.
 * nums2 имеет длину n.
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6]
 * with the underlined elements coming from nums1.
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
