package study;

import java.util.Scanner;

public class RecurtionOnTheLesson {
    static String s;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        rec(0);
    }
    public static void rec(int ind) {
        if (ind >= s.length()) {
            return;
        }
        System.out.print(s.charAt(ind));
        rec(ind + 1);
        if (s.charAt(ind) == '(') {
            System.out.print(')');
        } else {
            System.out.print(s.charAt(ind));
        }
    }
}
