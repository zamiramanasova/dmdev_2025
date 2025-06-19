package levelTwo.hashcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortClass {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "345","14","678");
        Collections.sort(strings);
        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1,"Ivan", "Ivanov"),
                new Person(29,"Petr", "Petrov"),
                new Person(3,"Sveta", "Svetikova")
        );
        Collections.sort(personList);
        System.out.println(personList);
        personList.sort(new FirstNameComparator());
        //JAVA 8
        personList.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getFirstName));
        System.out.println("=====");
        System.out.println(personList);
    }

    public static class FirstNameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
