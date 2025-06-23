package leetCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given two strings and , return if is an s t true t anagram of , and otherwise.s false
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Анаграмма — литературный приём, при котором буквы или звуки
 * определённого слова (или словосочетания) переставляются таким
 * образом, чтобы образовать другое слово или словосочетание.
 */
public class ValidAnagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(check(s,t));
    }

    public static boolean check(String s, String t) {
        //делаем проверку изначально
        if (s.length() != t.length()) {
            return false;
        }
        //затем сравнить их соответствуют ли они по размеру
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        //сначала нужно отсортировать входные данные
        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1, t1);
        //временная сложность log n
        //по памяти О1
    }

    //более сложное решение, сложное для понимания(для меня)
    public static boolean isAnagram(String s, String t) {
        //создаем массив с размером 26 на весь алфавит
        int[] charCounter = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounter[s.charAt(i) - 'a']++;//проверка идет с нуля
            charCounter[t.charAt(i) - 'a']--;//проверка идет с конца
        }
        for (int counter : charCounter) {
            if(counter != 0) {//если один из контеров равно нулю
                return false;
            }
        }
        return true;
    }
}
