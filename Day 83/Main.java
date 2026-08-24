// Codeforces 80A. Panoramix's Prediction
// https://codeforces.com/problemset/problem/80/A

import java.util.*;

public class Main {

    static boolean isPrime(int x) {
        if (x < 2) return false;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int nextPrime = n + 1;

        while (!isPrime(nextPrime)) {
            nextPrime++;
        }

        if (nextPrime == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}