package levelTwo.fileLesson.practice;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 *Задан файл с текстом, найти и вывести в консоль все слова
 *начинающиеся с гласной буквы
 */
public class TaskOOne {
    private static final String VOWELS = "уеыаоэяию";
    public static void main(String[] args) throws IOException {

        Path path = Path.of("resources", "test.txt");
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNext()) {
                String word = sc.next();
                char firstSymbol = word.charAt(0);
                if (VOWELS.indexOf(firstSymbol) != -1) {
                    System.out.println(word);
                }
            }
        }
     }
}
