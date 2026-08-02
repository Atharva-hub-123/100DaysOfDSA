// Codeforces 1189B. Number Circle
// https://codeforces.com/problemset/problem/1189/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        if (arr[n - 1] >= arr[n - 2] + arr[n - 3]) {
            System.out.println("NO");
            return;
        }

        ArrayList<Long> ans = new ArrayList<>();

        for (int i = 0; i < n; i += 2) {
            ans.add(arr[i]);
        }

        int start = (n % 2 == 0) ? n - 1 : n - 2;
        for (int i = start; i >= 1; i -= 2) {
            ans.add(arr[i]);
        }

        System.out.println("YES");

        for (long x : ans) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}