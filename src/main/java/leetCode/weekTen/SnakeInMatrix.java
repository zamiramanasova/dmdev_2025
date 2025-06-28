package leetCode.weekTen;
import java.util.*;

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
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String text = sc.next();
        List<String> steps = new ArrayList<>(Arrays.asList(text));
//        steps.add("UP");
//        steps.add("DOWN");
//        steps.add("RIGHT");
//        steps.add("LEFT");

        //int n = 2;

        System.out.println(finalPositionOfSnake(num, steps));
    }

    public static int finalPositionOfSnake(int n, List<String> commands) {
        int row = 0, col = 0;

        for (String count : commands) {
            if (count.equals("UP")) {
                row--;
            } else if (count.equals("DOWN")) {
                row++;
            } else if (count.equals("RIGHT")) {
                col++;
            } else if (count.equals("LEFT")) {
                col--;
            }
        }
        return row * n + col;
    }
}
