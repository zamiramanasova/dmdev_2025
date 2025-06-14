package levelTwo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRunner {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        List<Integer> list2 = new ArrayList<>(list);

        //цикл foreach только для чтения, тут нет удаления
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("===");

        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        System.out.println("===");

        for (Iterator<Integer> iterator1 = list2.iterator(); iterator1.hasNext(); ) {
            Integer next = iterator1.next();
            if (next == 3 || next == 4) {
                iterator1.remove();
            }
        }
        System.out.println(list2);
    }
}
