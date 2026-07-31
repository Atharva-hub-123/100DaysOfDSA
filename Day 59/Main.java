// Codeforces 1266A. Competitive Programmer
// https://codeforces.com/problemset/problem/1266/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int sum = 0;
            int zeroCount = 0;
            int evenCount = 0;

            for (char c : s.toCharArray()) {
                int digit = c - '0';

                sum += digit;

                if (digit == 0)
                    zeroCount++;

                if (digit % 2 == 0)
                    evenCount++;
            }

            if (sum % 3 == 0 && zeroCount >= 1 && evenCount >= 2)
                System.out.println("red");
            else
                System.out.println("cyan");
        }
    }
}