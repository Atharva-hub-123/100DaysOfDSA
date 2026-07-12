// Codeforces 144A.Arrival of the General
// https://codeforces.com/problemset/problem/144/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }

        int minIndex = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (heights[i] < heights[minIndex]) {
                minIndex = i;
            }
        }

        int swaps = maxIndex + (n - 1 - minIndex);
        
        if (maxIndex > minIndex) {
            swaps--;
        }

        System.out.println(swaps);
        scanner.close();
    }
}