// Codeforces 1169C. Increasing by Modulo
// https://codeforces.com/contest/1169/problem/C

import java.util.*;

public class Main {

    static int n, m;
    static int[] a;

    static boolean can(int T) {

        int prev = 0;

        for (int x : a) {

            if (x < prev) {
                if (x + T < prev) {
                    return false;
                }

            } 
            else {

                if (x + T >= m + prev) {
                } 
                else {
                    prev = x;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int low = 0;
        int high = m - 1;
        int answer = m - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (can(mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}

