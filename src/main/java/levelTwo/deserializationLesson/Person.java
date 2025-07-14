package levelTwo.deserializationLesson;

import java.io.Serializable;

public class Person implements Serializable {
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
