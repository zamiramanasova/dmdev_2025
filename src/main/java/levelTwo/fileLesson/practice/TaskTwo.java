package levelTwo.fileLesson.practice;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Задан файл с текстом, найти и вывести в консоль
 * все слова, для которых последяя буква
 * одного слова совпадает с первой буквой след.слова
 */
public class TaskTwo {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("resources", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            String prev = null;
            if (scanner.hasNext()) {
                prev = scanner.next();
            }
            while (scanner.hasNext()) {
                String current = scanner.next();
                if (isEqualLastSymbolAndSymbol(prev, current)) {
                    System.out.println(prev + " " + current);
                }
                prev = current;
            }


        }
    }

    private static boolean isEqualLastSymbolAndSymbol(String prev, String current) {
        return prev.charAt(prev.length() - 1) == current.charAt(0);
    }
}
