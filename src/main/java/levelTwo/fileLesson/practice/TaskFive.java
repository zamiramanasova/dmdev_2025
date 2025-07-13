package levelTwo.fileLesson.practice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

/**
 * Задан файл с java кодом. Прочитать текст программы из файла и
 * записать в другой файл в обратном порядке
 * символы каждой строки
 */
public class TaskFive {
    public static void main(String[] args) {

        Path path = Path.of("src", "main", "java", "levelTwo", "fileLesson", "practice", "TaskFour.java");
        Path result = Path.of("resources", "Task4.txt");
        try (Stream<String> lines = Files.lines(path);
            BufferedWriter bufferedWriter = Files.newBufferedWriter(result, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
                lines.map(StringBuilder::new)
                        .map(StringBuilder::reverse)
                        .forEach(line -> {
                            try {
                                bufferedWriter.write(line.toString());
                                bufferedWriter.newLine();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
