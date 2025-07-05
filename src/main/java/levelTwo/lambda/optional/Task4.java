package levelTwo.lambda.optional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список целых чисел, вывести строку,
 * представляющую конкатенацию строковых
 * представлений этих чисел.
 * напр: 1 2 3 5 7
 * строка 12357
 */
public class Task4 {
    public static void main(String[] args) {

        List<Integer> integers = List.of(5,2,4,2,1);
        String result = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
