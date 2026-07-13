// Codeforces 476A. Dreamoon and Stairs
// https://codeforces.com/problemset/problem/476/A

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int low = (n + 1) / 2;      

        int ans = ((low + m - 1) / m) * m; 

        if (ans <= n){
            System.out.println(ans);
        }
        else{
            System.out.println(-1);
        }
    }
}