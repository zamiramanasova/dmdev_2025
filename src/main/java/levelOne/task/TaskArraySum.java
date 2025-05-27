package levelOne.task;

/**
 * Определить сумму элементов целочисленного массива
 * расположенных между минимальным и максимальным элементом
 */
public class TaskArraySum {
    public static void main(String[] args) {

        // найти мин элемент
        // найти макс элемент, точнее его индекс
        // просуммировать
        //              0 1 2 3 4 5  6  7
        int[] values = {1,0,2,5,6,4,10,3};
        System.out.println("max: " + findMaxIndex(values));
        System.out.println("min: " + findMinIndex(values));

        System.out.println(calculateSumBetween(values));

    }
    public static int findMinIndex(int[] values) {
        //сначала присваиваем любой элемент из массива в новую переменную
        int minValue = values[0];
        int minIndex = 0;
        //итерация по массиву по порядку
        for (int i = 0; i < values.length; i++) {
            //и проверяем если minValue больше элемента value по индексу
            //то нас это не удовлетворяет, наша задача найти мин элемент и присвоить
            if (minValue > values[i]) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] values) {
        int maxIndex = 0;
        int maxValue = values[maxIndex];
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int calculateSumBetween(int[] values) {
        int minIndex = findMinIndex(values);
        int maxIndex = findMaxIndex(values);
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        int result = 0;

        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += values[i];
        }

        return result;
    }
}
