package leetCode.weekTwelve;

import java.util.Arrays;

/**
 * Учитывая целочисленный массив nums, переместите все
 * 0 в конец его, сохраняя относительный порядок ненулевых элементов.
 *
 * Обратите внимание, что вы должны сделать это на
 * месте, не создавая копию массива.
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 */
public class MoveZero {
    public static void main(String[] args) {
         int[] nums = new int[] {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        //Эта переменная запоминает «индекс, куда надо вставить
        // следующий ненулевой элемент».
        //Мы начинаем с начала массива, поэтому insertPos = 0.
        //С каждым найденным ненулевым значением этот индекс увеличивается.
        //insertPos = "следующая свободная позиция для ненуля"
        int insertPos = 0;

        //Проходит по всем элементам массива.
        //Каждый ненулевой элемент записывает на позицию insertPos.
        //После записи сдвигает insertPos на 1.
        //Очень важно!
        //Мы просто последовательно записываем все ненули в начало массива.
        //Их порядок сохраняется!
        //Нули при этом не записываются — они «отбрасываются» на этом этапе.
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
            //1) num = 0
            //0 == 0 → пропускаем
            //insertPos остается 0

            //2) num = 1
            //1 != 0 → пишем 1 на insertPos
            //nums[0] = 1
            //insertPos = 1

            //3) num = 0
            //пропускаем
            //insertPos = 1

            //4) num = 3
            //3 != 0 → пишем 3 на insertPos
            //nums[1] = 3
            //insertPos = 2
            //Массив: [1, 3, 0, 3, 12]

            // 5) num = 12
            //12 != 0 → пишем 12 на insertPos
            //nums[2] = 12
            //insertPos = 3
            //
            //Массив: [1, 3, 12, 3, 12]

            //После первого цикла:
            //nums = [1, 3, 12, 3, 12]
            //insertPos = 3
        }
        //"Пока insertPos меньше длины массива, вставляй 0
        // в эту позицию и увеличивай insertPos."
        //Как только insertPos == nums.length,
        // то есть когда мы достигли конца массива.
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }

    }
}
