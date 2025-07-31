package levelTwo.threads.account;

public class Account {
    private static int generator = 1;
    private int id;
    private int money;

    public Account(int money) {
        this.money = money;
        this.id = generator++;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}
