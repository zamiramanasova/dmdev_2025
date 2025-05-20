package levelOne.task;

/**
 * Написать программу определяющую является ли введенное
 * целое число простым. т.е делится без остатка только на 1
 * и на самого себя
 */
public class Task10 {
    public static void main(String[] args) {
        int value = 7;
        boolean result = number(value);
        System.out.println(result);
    }

    public static boolean number(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0)  {
                result = false;
                break;
            }
        }

        return result;
    }
}
