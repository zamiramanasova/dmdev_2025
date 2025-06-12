package leetCode;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        boolean reversed2 = reverseString(text);
        System.out.println(reversed2);

    }
    public static boolean reverseString(String s) {
        int left = 0;
        int right = s.length() - 1;

        /**
         * Character.isLetterOrDigit(ch) — проверяет, является ли
         * символ буквой или цифрой.
         *
         * Character.toLowerCase(ch) — чтобы игнорировать регистр.
         *
         * Два указателя (left, right) двигаются навстречу друг другу.
         *
         * Пропускаем пробелы, запятые, двоеточия и т. д.
         */

        while (left < right) {
            // Пропускаем все не-буквенно-цифровые символы слева
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Пропускаем все не-буквенно-цифровые символы справа
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Сравниваем символы в нижнем регистре
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
