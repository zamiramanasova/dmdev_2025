package levelTwo.composition;

public class Runner {
    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(500);
        Computer computer = new Computer(ssd, ram);
        computer.load();
        double sin = Math.sin(2.5);
    }
}
