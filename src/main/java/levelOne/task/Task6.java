package levelOne.task;

public class Task6 {
    public static void main(String[] args) {
        int year = 1900;
        isLeapYear(year);
        System.out.println(isLeapYear2(year));
        System.out.println(sum(2,3));

    }

    public static void isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("this year is true");
        } else {
            System.out.println("this year NOT true");
        }
    }

    public static boolean isLeapYear2(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static int sum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
