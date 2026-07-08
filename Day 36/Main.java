// Codeforces 1141A. Game 23
// https://codeforces.com/problemset/problem/1141/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        if (m % n != 0) {
            System.out.println(-1);
            return;
        }

        long factor = m / n;
        int moves = 0;

        while (factor % 2 == 0) {
            factor /= 2;
            moves++;
        }

        while (factor % 3 == 0) {
            factor /= 3;
            moves++;
        }

        if (factor != 1)
            System.out.println(-1);
        else
            System.out.println(moves);
    }
}