package levelTwo.composition;

public final class LapTop extends Computer {

    private int weight;

    {
        System.out.println("init block laptop");
    }

    static {
        System.out.println("static block laptop");
    }

    public LapTop() {
        System.out.println("Constructor laptop");
    }

    @Override
    public void load() {
        open();
        System.out.println("I am laptop and i am ready");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("weight " + weight);
    }

    public LapTop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }
    public void open() {
        System.out.println("I am open");
    }

    public int getWeight() {
        return weight;
    }
}
