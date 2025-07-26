package levelTwo.threads.methods;

import java.util.Queue;

public class BuyerThread implements Runnable {

    private final Queue<Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }
    @Override
    public void run() {
        try {
            while (true) {
                if (!cashboxes.isEmpty()) {
                    Cashbox cashbox = cashboxes.remove();
                    System.out.println(Thread.currentThread().getName() + " обслуживание на кассе " + cashbox);

                    Thread.sleep(5L);

                    System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashbox);
                    cashboxes.add(cashbox);
                } else {
                    System.out.println(Thread.currentThread().getName() + " ожидает свободную кассу");
                    Thread.sleep(5L);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
