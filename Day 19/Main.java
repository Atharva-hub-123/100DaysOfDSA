// Codeforces 723A - The New Year: Meeting Friends
// https://codeforces.com/problemset/problem/723/A

import java.util.*;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

        int maximum = Math.max(x1, Math.max(x2, x3));
        int minimum = Math.min(x1, Math.min(x2, x3));

        System.out.println(maximum - minimum);
    }
}