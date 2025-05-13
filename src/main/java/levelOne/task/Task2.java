package levelOne.task;

/**
 * Дано целое число. Определить,
 * является ли последняя цифра этого числа цифрой три
 */
public class Task2 {
    public static void main(String[] args) {
        int value = 23;
         //если наше значение при делении на 10 будет остаток 3
        if (value % 10 == 3) {
            System.out.println("last number is 3");
        }
    }
}
