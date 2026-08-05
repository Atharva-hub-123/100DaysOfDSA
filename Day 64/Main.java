// Codeforces 1355A. Sequence with Digits
// https://codeforces.com/problemset/problem/1355/A

import java.util.Scanner;

public class Main {

    private static long[] getMinMax(long num) {
        long min = 9;
        long max = 0;

        while (num > 0) {
            long digit = num % 10;
            min = Math.min(min, digit);
            max = Math.max(max, digit);
            num /= 10;
        }

        return new long[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long k = sc.nextLong();

            for (long i = 1; i < k; i++) {
                long result[] = getMinMax(a);

                long minDigit = result[0];
                long maxDigit = result[1];

                if (minDigit == 0) {
                    break;
                }

                a += minDigit * maxDigit;
            }

            System.out.println(a);
        }

        sc.close();
    }
}