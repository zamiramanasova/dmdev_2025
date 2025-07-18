package levelTwo.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        var simpleThread = new SimpleThread();
        System.out.println(simpleThread.getName() + ": " + simpleThread.getState());
        var simpleRunnable = new Thread(new SimpleRunnable(), "My name");
        var lambda = new Thread(() -> System.out.println("Hello from lambda: " + Thread.currentThread().getName()));
        simpleThread.start();
        System.out.println(simpleThread.getName() + ": " + simpleThread.getState());

        simpleRunnable.start();
        lambda.start();
        try {
            simpleThread.join(100L);
            System.out.println(simpleThread.getName() + ": " + simpleThread.getState());

            simpleRunnable.join();
            lambda.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
