package levelTwo.lessonOne;

public class Computer {
    int ssd = 500;
    long ram = 1024;

    Computer(int newSsd, long newRam) {
        this.ssd = newSsd;
        this.ram = newRam;
    }

    Computer(int newSsd) {
        ssd = newSsd;
    }

    Computer() {
        System.out.println("I am here");
    }

    void load() {
        System.out.println("I downloaded");
    }

    void load(boolean open) {
        System.out.println("I downloaded");
        if (open) {
            System.out.println("i open");
        }
    }

    void printState() {
        System.out.println(ssd + " " + ram);
    }

}
