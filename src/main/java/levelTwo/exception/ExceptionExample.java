package levelTwo.exception;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            System.out.println(finallyTest());
            unsafe(-10);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("main end");

    }
    public static int finallyTest() {
        try {
            return 2;
        } catch (Throwable throwable) {
            return 3;
        } finally {
            return 4;
        }
    }

    public static void unsafe(int value) throws FileNotFoundException{
        System.out.println("unsafe start");
        if (value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("unsafe end");
    }
}
