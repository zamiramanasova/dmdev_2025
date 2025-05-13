package levelOne.task;

public class Task5NewSwitch {
    public static void main(String[] args) {
        int value = 4;
        switch (value) {
            case 1 -> System.out.println("value == 1");
            case 2, 3, 4 -> System.out.println("value == 3,4");
            default -> System.out.println("Нет такого значения");
        }
    }
}
