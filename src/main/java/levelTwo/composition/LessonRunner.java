package levelTwo.composition;

public class LessonRunner {
    public static void main(String[] args) {

        LapTop lapTop = new LapTop(new Ssd(250), new Ram(1024), 2);
        Mobile mobile = new Mobile(new Ssd(250), new Ram(1024));

        LapTop lapTop1 = new LapTop(new Ssd(5000), new Ram(10000), 5);
        loadComputer(lapTop, mobile);
        printInformation(new Computer[]{lapTop, mobile, lapTop1});
    }

    public static void loadComputer(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
        }
    }

    public static void printInformation(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            if (computer instanceof LapTop) {
                LapTop lapTop = (LapTop) computer;
                lapTop.open();
            }
            System.out.println();
        }
    }
}
