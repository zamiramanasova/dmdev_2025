package levelTwo.exception.practice;

/**
 * Написать массив который создает а затем отловит
 * ArrayOutOfBoundsException
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7, 8};
        try {
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("catch");
            exception.printStackTrace();
        }
        System.err.println("end");
    }
}
