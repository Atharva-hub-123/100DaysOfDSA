// Codeforces 287B. Pipeline
// https://codeforces.com/contest/287/problem/B

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long n = Long.parseLong(input[0]);
        long k = Long.parseLong(input[1]);
        
        if (n == 1) {
            System.out.println(0);
            return;
        }
        
        long maxPipes = 1 + k * (k - 1) / 2;
        
        if (n > maxPipes) {
            System.out.println(-1);
            return;
        }
        
        long left = 1, right = k - 1, answer = -1;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            
            long pipesWithMid = 1 + mid * k - mid * (mid + 1) / 2;
            
            if (pipesWithMid >= n) {
                answer = mid;
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
        
        System.out.println(answer);
    }
}