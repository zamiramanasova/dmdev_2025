package leetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Вариант 1
 * 1) найти число которое меньше или равно этого числа chislo = -2
 * 9 - (chislo) == 2) найти это число
 * 9 - (-2) = 9 + 2 = 11
 * -2 + второе число = 9
 * второе число = 11
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] array = new int[]{-1, -2, -3, -4, -5};
        int[] result = twoSum(array, -8);
        System.out.println(result[0] == 2);
        System.out.println(result[1] == 4);
        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int number1 = nums[i];
            int number2 = target - number1;
            for (int j = 0; j < nums.length; j++) {
                if (number2 == nums[j]
                        && i != j) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (prevMap.containsKey(diff)) {
                return new int[]{prevMap.get(diff), i};
            }
            prevMap.put(num, i);
        }
        return new int[]{};
    }
}
//public static int[] twoSum(int[] nums, int target) {
//        int[] array = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            int number1 = nums[i];
//            int number2;
//            if (number1 <= target) {
//                number2 = target - number1;
//                for (int j = 0; j < nums.length; j++) {
//                    if (number2 == nums[j]
//                            && i != j) {
//                        array[0] = i;
//                        array[1] = j;
//                        return array;
//                    }
//                }
//            }
//        }
//        return array;
//    }
