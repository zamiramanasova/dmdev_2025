package levelOne.task;

/**
 * Написать программу высчитывающую факториал введенного целого числа
 */
public class Task7 {
    public static void main(String[] args) {
        int value = 5;
        factorial(value);
        System.out.println(factorial(value));
        System.out.println(factorialWhile(value));

    }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *=i; // result = result * i
        }
        return result;

    }

    public static int factorialWhile(int value) {
        int result = 1;
        int i = 1;
        while (i <= value) {
            result *= i; // result = result * i
            i++;
        }
        return result;
    }
}
