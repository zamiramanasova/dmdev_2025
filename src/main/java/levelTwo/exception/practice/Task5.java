package levelTwo.exception.practice;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

/**
 * Создать метод случайным образом выбрасывающий одно из 3х видов
 * исключений. Вызвать этот метод в блоке try catch
 * отлавливающий любое из трех
 */
public class Task5 {
    private static final Map<Integer, Throwable> EXCEPTIONS = Map.of(
            0, new RuntimeException("runtime"),
            1, new FileNotFoundException("file not found"),
            2, new IndexOutOfBoundsException("index exception")
    );
    public static void main(String[] args) {
        Random random = new Random();
        try {
            unsafe(random.nextInt(3));
        }catch (Throwable throwable) { // можно каждое исключение можно отлавливать отдельно создаваю много catch
            throwable.printStackTrace();
        }
    }
    public static void unsafe(int randomValue) throws Throwable {
        Throwable throwable = EXCEPTIONS.getOrDefault(randomValue, new DmDevException("not found"));
        throw throwable;
    }
}
