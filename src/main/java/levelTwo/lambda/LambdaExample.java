package levelTwo.lambda;

import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
        //старые методы
        Comparator<Integer> comparator = new IntegerComparator();
        System.out.println(comparator.compare(25,100));
        //анонимный класс
        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };
        //lambda
        Comparator<Integer> comparator2 = (Integer o1, Integer o2) -> Integer.compare(o1,o2);
        System.out.println(comparator.compare(25,100));
        //еще более лаконичное решение
        Comparator<Integer> comparator3 = Integer::compare;

    }

    private static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1,o2);
        }
    }
}
