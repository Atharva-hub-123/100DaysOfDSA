// Codeforces 1359A. Berland Poker
// https://codeforces.com/problemset/problem/1359/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int cards = n / k;

            int x = Math.min(m, cards);

            int remaining = m - x;

            int y = (remaining + (k - 2)) / (k - 1);

            int answer = x - y;

            System.out.println(answer);
        }

        sc.close();
    }
}