package levelTwo.lambda.optional;

import levelTwo.lambda.Student;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<Student> student = Stream.of(
                new Student(18, "a"),
                new Student(19, "a"),
                new Student(15, "a"),
                new Student(14, "a"),
                new Student(19, "a"),
                new Student(103, "a"),
                new Student(10, "a")
        )
                .sequential()
                .filter(student1 -> student1.getAge() < 10)
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);
        student.ifPresent(System.out::println);
        student.map(Student::getAge);
    }
}
