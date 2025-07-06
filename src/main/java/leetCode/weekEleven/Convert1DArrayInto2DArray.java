package leetCode.weekEleven;

import java.util.Arrays;

public class Convert1DArrayInto2DArray {
    public static void main(String[] args) {
        int[] ans = new int[] {1,2,3,4};
        System.out.println((Arrays.deepToString(construct2DArray(ans, 2, 2))));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        //Он преобразует одномерный массив original в двумерный массив размером m × n.
        //Если длина original не подходит (не равна m * n), то возвращает пустой массив.
        //Пример:
        //original.length = 6, m=2, n=3 → ок
        //original.length = 5, m=2, n=3 → нельзя → вернём пустой
        if (original.length != m * n ) {
            return new int[0][0];
        }

        //Создаём итоговый массив
        //Выделяем память под новый 2D массив с m строками и n столбцами.
        //Все элементы по умолчанию = 0.
        int[][] ans = new int[m][n];
        // Это указатель (индекс) по исходному одномерному массиву original.
        //Мы будем брать элементы по одному из original[k].
        int k = 0;
        // Внешний цикл по строкам i
        //✅ Внутренний цикл по столбцам j
        //На каждой итерации:
        //записываем original[k] в текущую ячейку ans[i][j]
        //увеличиваем k на 1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = original[k++];
            }
        }
        return ans;
    }
}
