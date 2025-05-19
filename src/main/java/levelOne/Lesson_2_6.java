package levelOne;

public class Lesson_2_6 {
    public static void main(String[] args) {
        // for инициализация- условие- что делать
        for (int value = 10; value > 0; value--) {
           System.out.println(value);
       }

        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i /= 2) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
    }
}
