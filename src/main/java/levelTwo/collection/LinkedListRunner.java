package levelTwo.collection;


import java.util.LinkedList;
import java.util.List;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        integers.addFirst(0);
        integers.addLast(6);
        integers.add(0,7);
        integers.remove(1);
        System.out.println(integers.getLast());
        System.out.println(integers.getFirst());
        System.out.println("==");

        for (Integer i : integers) {
            System.out.println(i);
        }
    }
}
