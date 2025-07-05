package leetCode.weekEleven;

public class FirstUniqueInAString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqueChar(s));

    }

    public static int firstUniqueChar(String s) {
        //Посчитать количество каждого символа в строке.
        //
        //Найти первый символ, который встретился ровно 1 раз.
        //
        //Вернуть его индекс.
        char[] charsArray = s.toCharArray();
        //Внешний цикл выбирает каждый символ i.
        //Внутренний цикл проверяет все остальные позиции j.
        //Если где-то нашли charsArray[i] == charsArray[j] (но i ≠ j) → это не уникальный символ.
        //Если прошли и не нашли дубликатов → возвращаем индекс i.
        for (int i = 0; i < charsArray.length; i++) {
            // В нашем коде переменная isUnique — это флаг.
            //
            //Он помогает нам запомнить: «уникальный ли текущий символ или нет».
            boolean isUnique = true;
            for (int j = 0; j < charsArray.length; j++) {
                if (i != j && charsArray[i] == charsArray[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return -1;
        // Медленнее (O(N^2)) для очень длинных строк.
    }
}
