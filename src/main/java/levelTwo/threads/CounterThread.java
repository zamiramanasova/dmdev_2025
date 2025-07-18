package levelTwo.threads;

/**
 * Создать класс с одним полем и конструктором для инициализации
 * TaskOneCounter
 * В методе run этого класса в цикле 100 раз вызвать
 * counter.increment()
 */
public class CounterThread extends Thread {

    private TaskOneCounter counter;

    public CounterThread(TaskOneCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
        }
    }
}
