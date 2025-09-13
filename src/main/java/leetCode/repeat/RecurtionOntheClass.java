package leetCode.repeat;

import java.util.Scanner;

public class RecurtionOntheClass {
    static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (rec(1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static boolean rec(int x) {
        if (x > n) {
            return false;
        } else if (x == n) {
            return true;
        }
        //x <= n
        //option 1. +3
        if (rec(x + 5)) {
            return true;
        }
        if (rec(x + 3)) {
             return true;
        }
        return false;
    }
}
