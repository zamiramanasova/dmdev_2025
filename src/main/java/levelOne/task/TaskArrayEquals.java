package levelOne.task;

/**
 * Нап метод equals который определяет
 * равны ли между собой соответствующие элементы
 * 2-х мерныых массивов
 */
public class TaskArrayEquals {
    public static void main(String[] args) {
        int[][] array1 = {
                {1,2,3},
                {5,2,8},
                {9,10},
        };
        int[][] array2 = {
                {1,2,3},
                {5,2,8},
                {9,10},
        };
        //boolean result = equals(array1, array2);
        System.out.println(equals(array1, array2));
    }

    // Объявление статического метода, который принимает
    // два двумерных массива и возвращает булевое
    // значение (true или false).
    public static boolean equals(int[][] values1, int[][] values2) {
        //Если массивы имеют разное количество строк,
        // они не равны → вернуть false.
        if (values1.length != values2.length) {
            return false;
        }
        //Проходим по всем строкам обоих массивов.
        // На каждой итерации берутся соответствующие строки row1 и row2.
        for (int i = 0; i < values1.length; i++) {
            int[] row1 = values1[i];
            int[] row2 = values2[i];
            //Если длины соответствующих строк различны → массивы не равны.
            if (row1.length != row2.length) {
                return false;
            }
            //Сравниваются элементы строк row1 и row2 поэлементно.
            // Если найден хоть один элемент, который не равен →
            // возвращается false.
            for (int j = 0; j < row1.length; j++) {
                if (row1[j] != row2[j]) {
                    return false;
                }
            }
        }
        // Если все строки одинаковой длины и все
        // элементы совпадают — массивы равны, вернуть true.
        return true;
    }
}
