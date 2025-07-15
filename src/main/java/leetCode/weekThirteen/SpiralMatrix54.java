package leetCode.weekThirteen;

import java.util.ArrayList;
import java.util.List;

/**
 * дан m x n двумерный массив (матрица).
 * Нужно вернуть все его элементы в спиральном порядке.
 */
public class SpiralMatrix54 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1. слева направо
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            //сверху вниз
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            //справа налево
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //снизу вверх
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }


        return result;
    }
    //Основная идея решения
    //Подумай о матрице как о рамках/границах:
    //
    //top — верхняя граница ряда
    //
    //bottom — нижняя граница ряда
    //
    //left — левая граница колонки
    //
    //right — правая граница колонки
    //
    //✅ Пока top ≤ bottom и left ≤ right:
    //1️⃣ Идём слева направо по верхнему ряду
    //2️⃣ Идём сверху вниз по правой колонке
    //3️⃣ Идём справа налево по нижнему ряду (если осталось)
    //4️⃣ Идём снизу вверх по левой колонке (если осталось)
    //
    //И каждый раз сужаем рамки.
}
