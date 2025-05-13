package study;

import java.util.Collections;
import java.util.LinkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<Integer> prices = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        prices.add(1);
        prices.add(2);
        System.out.println(mergeTwoLists(numbers,prices));
    }
    public static LinkedList mergeTwoLists(LinkedList list1, LinkedList list2) {
        list2.addAll(list1);
        Collections.sort(list2);
        return list2;
    }
}
