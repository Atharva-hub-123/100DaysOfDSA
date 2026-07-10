// Codeforces 1373A. Donut Shops
// https://codeforces.com/problemset/problem/1373/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long first = (a < c) ? 1 : -1;
            long second = (a * b > c) ? b : -1;

            System.out.println(first + " " + second);
        }
        sc.close();
    }
}