package levelTwo.composition;

public class Runner {
    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(500);

        LapTop lapTop = new LapTop(new Ssd(512), new Ram(250), 2);
        lapTop.open();
        lapTop.load();
    }
}
