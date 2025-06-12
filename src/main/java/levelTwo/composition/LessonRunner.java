package levelTwo.composition;

public class LessonRunner {
    public static void main(String[] args) {
        LapTop lapTop = new LapTop(new Ssd(250), new Ram(1024), 2);
        Mobile mobile = new Mobile(new Ssd(250), new Ram(1024));

        loadComputer(lapTop, mobile);
        printInformation(new Computer[]{lapTop, mobile});
    }

    public static void loadComputer(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
        }
    }

    public static void printInformation(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
        }
    }
}
