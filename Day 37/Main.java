// Codeforces 1430C. Numbers on Whiteboard
// https://codeforces.com/problemset/problem/1430/C


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int cur = n;
            List<int[]> operations = new ArrayList<>();

            for (int i = n - 1; i >= 1; i--) {
                operations.add(new int[]{cur, i});
                cur = (cur + i + 1) / 2;
            }

            System.out.println(cur);

            for (int[] op : operations) {
                System.out.println(op[0] + " " + op[1]);
            }
        }

        sc.close();
    }
}