package levelTwo.fileLesson;

import java.io.File;
import java.io.IOException;

/**
 * input stream - введение инфы
 * output stream - вывод инфы
 */
public class FileRunner {
    public static void main(String[] args) throws IOException {

        File file = new File("resources/test.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
    }
}
