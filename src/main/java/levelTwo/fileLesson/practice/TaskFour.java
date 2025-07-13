package levelTwo.fileLesson.practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Задан файл с java кодом. Прочитать текст программы из файла и
 * все слова public в объявлении атрибутов и методов класса заменить
 * на слово private. Результат сохранить в другой заранее
 * созданный файл.
 */
public class TaskFour {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("src", "main", "java", "levelTwo", "fileLesson", "practice", "TaskThree.java");
        String readString = Files.readString(path);
        String result = readString.replace("public", "private");

        Path resultPath = Path.of("resources", "TaskThree.java");
        Files.writeString(resultPath, result);
    }
}
