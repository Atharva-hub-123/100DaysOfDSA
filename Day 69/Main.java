// Codeforces 1342A. Road To Zero
// https://codeforces.com/problemset/problem/1342/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            long a = sc.nextLong();
            long b = sc.nextLong();

            long common = Math.min(x, y);
            long difference = Math.abs(x - y);

            long answer = common * Math.min(2 * a, b)
                        + difference * a;

            System.out.println(answer);
        }

        sc.close();
    }
}