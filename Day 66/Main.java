// Codeforces 1476A. K-divisible Sum
// https://codeforces.com/problemset/problem/1476/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long multiplier = (n + k - 1) / k;     
            long targetSum = multiplier * k;       
            long answer = (targetSum + n - 1) / n;

            System.out.println(answer);
        }

        sc.close();
    }
}