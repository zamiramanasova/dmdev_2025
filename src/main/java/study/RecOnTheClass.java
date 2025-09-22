package study;

import java.util.ArrayList;
import java.util.Scanner;

public class RecOnTheClass {
    static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        rec(1, true, new ArrayList<Integer>());
        rec(1, false, new ArrayList<Integer>());

    }
    public static void rec(int ind, boolean taken, ArrayList<Integer> arr) {
        if (ind > n) {
            if (taken) {
                for (int to : arr) {
                    System.out.print(to + " ");
                }
                System.out.println("");
            }
            return ;
        }
        if (taken) {
            arr.add(ind);
        }
        rec(ind + 1, true, arr);
        rec(ind + 1, false, arr);
        if (taken) {
            arr.remove(arr.size() - 1);
        }
    }

    public static void rec2(int ind, boolean taken, ArrayList<Integer> arr) {
        if (ind > n)
            return;
        if (taken) {
            arr.add(ind);
        }
        if (ind == n) {
            for (int to : arr) {
                System.out.print(to + " ");
            }
            System.out.println("");
        }
        if (taken) {
            arr.remove(arr.size() - 1);
        }
        rec(ind + 1, true, arr);
        rec(ind + 1, false, arr);

    }
}
