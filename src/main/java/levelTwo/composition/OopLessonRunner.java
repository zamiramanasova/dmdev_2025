package levelTwo.composition;

public class OopLessonRunner {
    public static void main(String[] args) {
        Printable lapTop = new LapTop(new Ssd(250), new Ram(1024), 2);
        Printable mobile = new Mobile(new Ssd(250), new Ram(1024));
        printWithRandom(lapTop, mobile);

    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }

    public static void printWithRandom(Printable... objects) {
        for (Printable object : objects) {
            object.printWithRandom();
            System.out.println();
        }
    }
}
