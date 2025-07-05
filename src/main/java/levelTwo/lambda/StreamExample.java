package levelTwo.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        System.out.println("1 ==========");
        //до стримов
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
        //STREAM
        strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                //.skip(1)
                .limit(2)
                .mapToInt(Integer::intValue)
                //.forEach(System.out::println);
                .summaryStatistics();
        System.out.println(strings);
        System.out.println("2 ==========");

        List<String> collect = Stream.of("88", "11", "22", "33", "44", "55", "66")
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("3 ==========");

        IntStream.range(0, 10)
                .forEach(System.out::println);

        System.out.println("4 ==========");
        IntStream.iterate(0, operand -> operand + 3)
                .skip(10)
                .limit(20)
                .forEach(System.out::println);

        System.out.println("5 ==========");

        for (String string : strings) {
            String value = string + string;
            Integer intValue = Integer.valueOf(value);
            if (intValue % 2 == 0) {
                System.out.println(intValue);
            }
        }


    }
}
