package levelOne;

public class Lesson_2_9 {
    public static void main(String[] args) {
        arrays();
        int[][] values = new int[3][];
        values[0] = new int[5];
        values[1] = new int[2];
        values[2] = new int[1];
        print(values);//выведет нам первое измерение,
        //0 0 0 0 0
        //0 0
        //0
    }

    private static void print(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            int[] ints = values[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
        private static void arrays () {
            int[][] array = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
            };
            //идем по первому измерению это 1 2 3
            for (int i = 0; i < array.length; i++) {
                int[] ints = array[i];
                for (int j = 0; j < ints.length; j++) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println();
            }
        }
    }
