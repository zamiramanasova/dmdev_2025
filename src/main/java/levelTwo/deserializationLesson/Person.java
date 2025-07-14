package levelTwo.deserializationLesson;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private int age;
    private String firstName;

    public Person(int age, String firstname) {
        this.age = age;
        this.firstName = firstname;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
