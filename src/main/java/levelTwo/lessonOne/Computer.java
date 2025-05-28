package levelTwo.lessonOne;

public class Computer {
    int ssd = 500;
    int ram = 1024;

    Computer(int newSsd, int newRam) {
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

    void printState() {
        System.out.println(ssd + " " + ram);
    }

}
