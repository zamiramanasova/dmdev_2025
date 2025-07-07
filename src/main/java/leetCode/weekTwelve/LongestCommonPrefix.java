package leetCode.weekTwelve;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] array = new String[] {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(array));

    }

    public static String longestCommonPrefix(String[] strs) {
        //Начинаем с предположения, что весь первый элемент — это префикс.
        //Для каждой следующей строки проверяем, начинается ли
        //она с этого префикса.
        //Если нет — укорачиваем префикс на 1 символ с конца.
        //Продолжаем сокращать, пока он не подойдет или не станет пустым.
        if (strs == null || strs.length == 0)
            return "";
        //Берём первый элемент массива как начальный кандидат на префикс.
        //Почему? Потому что общий префикс не может быть
        //длиннее любой строки, особенно первой.
        //Пример:
        //Вход: ["flower", "flow", "flight"]
        //prefix = "flower"
        String prefix = strs[0];
        //Начинаем с 1, потому что 0-ой элемент уже в prefix.
        //Цель: проверить, подходит ли текущий префикс к каждой следующей строке.
        for (int i = 1; i < strs.length; i++) {
            //Пока строка strs[i] не начинается с prefix, будем укорачивать его.
            //Метод startsWith() проверяет, является ли prefix началом строки.
            //Пример:
            //i = 1, strs[1] = "flow"
            //"flow".startsWith("flower") ❌
            //укорачиваем
            while (!strs[i].startsWith(prefix)) {
                if (prefix.length() == 0)
                    return "";
                //Урезаем последний символ.
                //Это ключевая идея!
                //Если префикс не подходит → пробуем его вариант короче на 1.
                //Например: "flower" → "flowe" → "flow" → "flo" → ...
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        //После проверки всех строк возвращаем найденный общий префикс.
        return prefix;
    }
}
