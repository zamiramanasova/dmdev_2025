package levelTwo.fileLesson;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
        File file1 = Path.of("resources", "test.txt").toFile();
        try (FileInputStream inputStream = new FileInputStream(file1)) {
            byte[] bytes = inputStream.readAllBytes();
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }
    }
}
