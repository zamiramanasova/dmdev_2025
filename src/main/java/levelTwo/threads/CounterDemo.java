package levelTwo.threads;

/**
 * В методе мэйн создать 4 потока типа CounterThread
 * передав один и тот же объект каунтер и запустить их,
 * дождаться выполнения и вывести на консоль в текущее значение
 * нашего счетчика counter.getCount();
 */
public class CounterDemo {
    public static void main(String[] args) {
        TaskOneCounter counter = new TaskOneCounter();
        CounterThread counterThread = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        CounterThread counterThread3 = new CounterThread(counter);
        CounterThread counterThread4 = new CounterThread(counter);

        counterThread.start();
        counterThread2.start();
        counterThread3.start();
        counterThread4.start();

        try {
            counterThread.join();
            counterThread2.join();
            counterThread3.join();
            counterThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
    }
}
