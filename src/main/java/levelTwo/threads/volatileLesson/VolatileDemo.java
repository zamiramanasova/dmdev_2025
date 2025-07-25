package levelTwo.threads.volatileLesson;

public class VolatileDemo {

    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("thread1 still false");
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            flag = true;
            System.out.println("flag is set");
        });
        thread2.start();
    }

}
