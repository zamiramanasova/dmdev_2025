package levelOne.task;

/**
 * Имеется число. Посчитать сумму данного числа.
 */
public class Task8 {
    public static void main(String[] args) {
        int value = 12;
        System.out.println(sum(value));
        System.out.println("======");
        System.out.println(sum2(value));
        System.out.println("======");
        System.out.println(sum3(value));
    }
    // здесь считает так, если даешь 5 то 1+2+3+4+5 = 15
    // 1+2+3+4+5+6+7+8+9+10+11+12 = 78
    public static int sum(int value) {
        int result = 0;
        for(int i = 0; i <= value; i++) {
             result += i;
        }
        return result;
    }

    //здесь если даешь 123 = 1+2+3 = 6, если даешь 5 то даст 5
    public static int sum2(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            //записали после остатка от 10 в резалт
            result += currentValue % 10;
            //после этого делим каррентвэлъю на 10
            currentValue /= 10;
            //потом опять по циклю с этим числом
            //каррент дальше крутим пока не станет нулем
        }
        return result;
    }

    //здесь если даешь 123 = 1+2+3 = 6, если даешь 5 то даст 5
    public static int sum3(int value) {
        int result = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }
        return result;
    }
}
