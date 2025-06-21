package levelTwo.hashcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        new HashSet<>();
        new TreeSet<>();
        Set<String> set = new LinkedHashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("bbb");

        System.out.println(set);
        for (String value : set) {
            System.out.println(value);
        }
    }
}
