package levelTwo.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
