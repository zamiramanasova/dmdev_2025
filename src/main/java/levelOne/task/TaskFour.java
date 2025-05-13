package levelOne.task;

/**
 * Написать программу, которая считывает год, введенный пользователем и
 * определяет, является ли этот год високосным
 * Год считается високосным если он делится без остатка на 4.
 * Однако, если год делится также на 100,
 * то этот год не високосный, за исключением годов, делящихся на 400
 */
public class TaskFour {
    public static void main(String[] args) {
        int year = 1900;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("this year is true");
        } else {
            System.out.println("this year NOT true");
        }
    }
}
