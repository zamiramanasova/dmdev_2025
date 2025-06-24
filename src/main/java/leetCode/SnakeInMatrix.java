package leetCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Есть змейка в матрице и может двигаться в четырех
 * направлениях. Каждая ячейка в списке определяется
 * позицией: .n x n
 * grid[i][j] = (i * n) + j
 *
 * Змейка начинает с ячейки 0 и следует последовательности команд.
 *
 * Вам дается целое число, представляющее размер строк и
 * массив строк, где каждая из них равна либо , , либо .
 * Это гарантирует, что змея будет оставаться в пределах
 * границ на протяжении всего своего движения.
 * n grid commands command[i] "UP" "RIGHT" "DOWN" "LEFT"
 *
 * Возвращает позицию последней ячейки, в которой
 * оказывается змейка после выполнения .commands
 *
 * Мы можем использовать две переменные x и y
 * Наконец, возвращаемся x×n+y
 * Сложность по времени составляет O(n) где n — длина массива
 * Команды. Сложность пространства таковаO(1)..
 */


public class SnakeInMatrix {
    public static void main(String[] args) {
        List<String> steps = new ArrayList<>();
        steps.add("DOWN");
        steps.add("RIGHT");
        steps.add("DOWN");
        //steps.add("LEFT");

        int n = 3;

        System.out.println(finalPositionOfSnake(n, steps));
    }

    public static int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0, y = 0;

        for (String count : commands) {
            switch (count) {
                case "UP" -> x--;
                case "RIGHT" -> x++;
                case "DOWN" -> y--;
                case "LEFT" -> y++;
            }
        }
        return x * n + y;
    }
}
