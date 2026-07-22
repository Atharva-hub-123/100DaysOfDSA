// Codeforces 109A. Lucky Sum of Digits
// https://codeforces.com/problemset/problem/109/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        for (int count7 = n / 7; count7 >= 0; count7--) {
            int remaining = n - (7 * count7);
            if (remaining % 4 == 0) {
                int count4 = remaining / 4;
                
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < count4; i++) {
                    result.append('4');
                }
                for (int i = 0; i < count7; i++) {
                    result.append('7');
                }
                
                System.out.println(result.toString());
                return;
            }
        }
        
        System.out.println(-1);
    }
}