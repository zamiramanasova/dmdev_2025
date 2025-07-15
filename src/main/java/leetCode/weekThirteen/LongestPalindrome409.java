package leetCode.weekThirteen;

import java.util.HashMap;
import java.util.Map;

/**
 * Если задана строка s, состоящая из строчных или
 * прописных букв, возвращает длину самого длинного
 * палиндрома, который можно составить из этих букв.
 *
 * Буквы чувствительны к регистру, например,
 * "Aa" не считается палиндромом.
 */
public class LongestPalindrome409 {
    public static void main(String[] args) {

        String s = "abccccdd";
        int res = longestPalindrome(s);
        System.out.println(res);
    }

    public static int longestPalindrome(String s) {
        // Ключевая идея:
        //Палиндром может содержать чётное число каждой
        // буквы (например, 2x 'a', 2x 'b').
        //
        //Можно включить только одну букву с нечётным
        // количеством в центр палиндрома.

        //считаем количество каждой буквы
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        //проходим по всем частотам
        for (int freg : count.values()) {
            if (freg % 2 == 0) {
                length += freg; //можно взять все
            } else {
                length += freg - 1; //оставляем одну лишнюю для середины
                hasOdd = true; //запомним, что у нас есть хотя бы одна нечетная
            }
        }
        if (hasOdd) {
            length += 1; //добавляем один символ в центр
        }
        return length;
    }
}
