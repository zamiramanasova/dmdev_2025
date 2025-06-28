package levelTwo.exception.practice;

/**
 * Объявите переменную со значением null.
 * Вызовите метод у этой переменной. Отловите возникшее исключение
 */
public class Task1 {
    public static void main(String[] args) {
        String value = null;
        try {
            value.length();
        } catch (NullPointerException e) {
            System.err.println("catch");
            e.printStackTrace();
        }


    }
}
