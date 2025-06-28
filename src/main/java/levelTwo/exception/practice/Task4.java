package levelTwo.exception.practice;

/**
 * Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить свое собственное, указав в качестве причины отловленное
 */
public class Task4 {
    public static void main(String[] args) {
        try {
            catchCustomException();
        } catch (DmDevException e) {
            System.out.println("catched in main");
            e.printStackTrace();
        }

    }

    public static void catchCustomException() throws DmDevException {
        try {
            unsafe();
        } catch (RuntimeException exception) {
            System.out.println("catch CUSTOM");
            throw new DmDevException(exception);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("Oops");
    }

 }
