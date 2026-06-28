// Codeforces 110A. Nearly Lucky Number
// https://codeforces.com/problemset/problem/110/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        int count = 0;
        for (char ch : n.toCharArray()) {
            if (ch == '4' || ch == '7') {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("NO");
            return;
        }

        int temp = count;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 4 && digit != 7) {
                System.out.println("NO");
                return;
            }
            temp /= 10;
        }

        System.out.println("YES");
    }
}