// Codeforces 507A. Amr and Music
// https://codeforces.com/problemset/problem/507/A

import java.util.*;

public class Main {

    static class Pair {
        int days;
        int index;

        Pair(int days, int index) {
            this.days = days;
            this.index = index;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Pair arr[] = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(sc.nextInt(), i + 1);
        }

        Arrays.sort(arr, (a, b) -> a.days - b.days);

        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;

        for (Pair p : arr) {
            if (sum + p.days <= k) {
                sum += p.days;
                ans.add(p.index);
            } else {
                break;
            }
        }

        System.out.println(ans.size());

        for (int idx : ans) {
            System.out.print(idx + " ");
        }
    }
}