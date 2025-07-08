package leetCode.weekTwelve;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "output.txt").toFile();
        //                                                            если здесь убрать true то новой записи не будет, он будет игнорить
        try (FileOutputStream outputStream = new FileOutputStream(file, true)) {
            String value = "Hello World!";
            outputStream.write(value.getBytes());
            //запись с новой строки
            outputStream.write(System.lineSeparator().getBytes());
        }
    }
}
