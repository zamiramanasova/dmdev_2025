package levelOne.task;

/**
 * Написать массив, которая печатает сначала в
 * обычном порядке затем в обратном
 */
public class TaskArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        printArray(array);
        printArrayForeach(array);
        printArrayReverse(array);
    }
    public static void printArrayReverse(int[] array) {
        // int i = array.length - 1 — инициализация:
        // переменная i получает индекс последнего элемента
        // массива (array.length - 1).
        // i >= 0 — условие: цикл продолжается,
        // пока индекс i больше или равен нулю
        // (т.е. пока мы не дошли до начала массива).
        // i-- — итерация: после каждой итерации i
        // уменьшается на 1 (движение назад по массиву).
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //foreach
    public static void printArrayForeach(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
