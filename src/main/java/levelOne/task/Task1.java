package levelOne.task;

/**
 * Дан порядковый номер месяца.
 * Вывести на консоль пору года, к которой относится месяц
 */
public class Task1 {
    public static void main(String[] args) {
        int month = 13;
        // зима = 12, 1, 2
        // весна = 3 4 5
        // лето = 6 7 8
        // осень = 9 10 11
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("autumn");
        } else {
            System.out.println("add normal month of the year!");
        }
    }
}
