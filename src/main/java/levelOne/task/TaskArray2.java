package levelOne.task;

/**
 * Написать программу, заносящую в массив первые 100 чисел,
 * делящихся на 13 или на 17 и печатающую его
 */
public class TaskArray2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        fillArray(array);
        TaskArray.printArray(array);
    }

    public static void fillArray(int[] values) {
        int currentIndex = 0;//создание переменной куда записываются значения
        for (int currentValue = 1; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex] = currentValue;
                currentIndex++;
            }
        }
    }
}
