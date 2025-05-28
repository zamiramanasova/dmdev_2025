package levelTwo.lessonOne;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.load();
        System.out.println(computer.ram);
        System.out.println(computer.ssd);
        computer.printState();
        System.out.println("=====");
        Computer computer1 = new Computer(1050);
        computer1.printState();
        System.out.println("=====");
        Computer computer2 = new Computer(10000, 10000);
        computer2.printState();
        System.out.println("=====");
    }
}
