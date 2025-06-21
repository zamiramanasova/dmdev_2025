package levelTwo.hashcode.practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Написать метод countUnigue, который принимает целочисленный
 * список в качестве параметра и возвращает колчество уникальных целых чисел
 * в этом списке.
 * При получении пустого списка метод должен возвращать 0.
 * Пример
 * 3 7 3 -1 2 3 7 2 15 15 вернет 5
 */
public class TaskTwo {
    public static void main(String[] args) {
        List<Integer> integers = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUnigue(integers));
    }
    public static int countUnigue(List<Integer> list) {
        Set<Integer> integers = new HashSet<>(list);
        return integers.size();
    }
}
