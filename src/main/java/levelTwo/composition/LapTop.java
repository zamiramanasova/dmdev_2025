package levelTwo.composition;

public class LapTop extends Computer {

    private int weight;

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
