package levelTwo.exception.practice;

/**
 * Создать собственный класс исключение наследник класса
 * Exception. Создать метод выбрасывающий это исключение. Вызвать этот метод
 * и отловить исключение. Вывести stack trace в консоль.
 */
public class Task3 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (DmDevException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void unsafe() throws DmDevException {
        throw new DmDevException(new RuntimeException("Test exception"));
    }
}
