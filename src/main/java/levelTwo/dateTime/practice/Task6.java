package levelTwo.dateTime.practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Даны два объекта LocalDate из предыдущего задания.
 * Подсчитать количество секунд между полуночью первой
 * даты и полуночью второй даты
 */
public class Task6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);

        LocalDateTime localDateTime = now.atStartOfDay();
        LocalDateTime localDateTime1 = prevDate.atStartOfDay();

        Duration duration = Duration.between(localDateTime1, localDateTime);
        System.out.println(duration.getSeconds());
    }
}
