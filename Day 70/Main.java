// Codeforces 1038B. Non-Coprime Partition
// https://codeforces.com/problemset/problem/1038/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n == 1) {
            System.out.println("No");
            return;
        }
        
        long totalSum = (long)n * (n + 1) / 2;
        
        long p = findPrimeFactor(totalSum);
        
        if (p == -1) {
            System.out.println("No");
            return;
        }
        
        List<Integer> s1 = new ArrayList<>();
        long targetSum = p;
        boolean[] used = new boolean[n + 1];
        
        while (true) {
            if (findSubset(n, targetSum, s1, used)) {
                break;
            }
            targetSum += p;
            if (targetSum > totalSum) {
                System.out.println("No");
                return;
            }
        }
        
        List<Integer> s2 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                s2.add(i);
            }
        }
        
        if (s2.isEmpty()) {
            System.out.println("No");
            return;
        }
        
        System.out.println("Yes");
        System.out.print(s1.size());
        for (int num : s1) {
            System.out.print(" " + num);
        }
        System.out.println();
        System.out.print(s2.size());
        for (int num : s2) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
    
    static long findPrimeFactor(long num) {
        if (num % 2 == 0) return 2;
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return i;
        }
        return -1;
    }
    
    static boolean findSubset(int n, long targetSum, List<Integer> subset, boolean[] used) {
        for (int i = n; i >= 1 && targetSum > 0; i--) {
            if (!used[i] && i <= targetSum) {
                subset.add(i);
                used[i] = true;
                targetSum -= i;
            }
        }
        return targetSum == 0;
    }
}