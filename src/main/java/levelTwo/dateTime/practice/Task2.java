package levelTwo.dateTime.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Создать объект LocalDate, представляющий собой сегоднящнюю дату.
 * Преобразовать дату в строку вида "05.05.201"
 * Вывести эту строку на консоль
 */
public class Task2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String format = now.format(formatter);
        System.out.println(format);
    }
}
