package levelTwo.composition;

public class OopLessonRunner {
    public static void main(String[] args) {
        Computer lapTop = new LapTop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(250), new Ram(1024));
        print(lapTop, mobile);

    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }
}
