// Codeforces 630D. Hexagons!
// https://codeforces.com/problemset/problem/630/D

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long ans = 3 * n * n + 3 * n + 1;

        System.out.println(ans);
    }
}