package levelTwo.threads;

/**
 * Создать класс counter с одним полем
 * private int counter
 *
 * добавить методы
 * getCounter - для получ.поля каунт
 * increment - для увеличения значения поля на единицу
 * decrement - для уменьшения значения поля на единицу
 */
public class TaskOneCounter {
    private int count;

    public void increment() {
        synchronized (this) {
            count++;
        }

    }

    public synchronized void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
