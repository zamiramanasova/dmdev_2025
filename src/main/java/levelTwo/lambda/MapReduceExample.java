package levelTwo.lambda;

import java.util.stream.Stream;

public class MapReduceExample {
    /**
     * 1000000 -> age -> max
     * 1000000 -> age -> max -> max
     * 1000000 -> age -> max
     * @param args
     */
    public static void main(String[] args) {
        Stream.of(
                new Student(18, "a"),
                new Student(19, "a"),
                new Student(15, "a"),
                new Student(14, "a"),
                new Student(19, "a"),
                new Student(103, "a"),
                new Student(10, "a")
        )
                //если выводить одним потоком, если нужно распараллелить то нужно исп.метод параллель
                .sequential()
                .map(Student::getAge)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
