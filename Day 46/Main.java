// Codeforces 1133A. Middle of the Contest
// https://codeforces.com/problemset/problem/1133/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String start = sc.next();
        String end = sc.next();

        String s[] = start.split(":");
        String e[] = end.split(":");

        int h1 = Integer.parseInt(s[0]);
        int m1 = Integer.parseInt(s[1]);

        int h2 = Integer.parseInt(e[0]);
        int m2 = Integer.parseInt(e[1]);

        int startMinutes = h1 * 60 + m1;
        int endMinutes = h2 * 60 + m2;

        int mid = (startMinutes + endMinutes) / 2;

        int hour = mid / 60;
        int minute = mid % 60;

        System.out.printf("%02d:%02d%n", hour, minute);
    }
}