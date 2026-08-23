// Codeforces 912B. New Year's Eve
// https://codeforces.com/problemset/problem/912/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        if (k == 1) {
            System.out.println(n);
            return;
        }

        long p = Long.highestOneBit(n);

        long answer = 2 * p - 1;

        System.out.println(answer);
    }
}
