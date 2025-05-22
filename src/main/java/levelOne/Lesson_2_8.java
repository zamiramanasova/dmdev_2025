package levelOne;

public class Lesson_2_8 {
    public static void main(String[] args) {
        int[] values = new int[10];
        //System.out.println(values[5]);
        values[4] = 9;
        values[7] = 98;

        for (int i = 0; i < values.length; i++) {
            System.out.println(i + ": " + values[i]);
        }

    }

    public static void test() {
        int value = 10;
        int[] values = {1, 5, 6, 8, 9};
        System.out.println(values[2]);

        values[3] = 18;
        System.out.println(values[3]);
    }
}
