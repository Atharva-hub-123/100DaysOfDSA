// Codeforces 702.A Maximum Increase
// https://codeforces.com/problemset/problem/702/A

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int [n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int currentLen = 1;
        int maxLen = 1;

        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i-1]){
                currentLen++;
            }
            else{
                currentLen = 1;
            }
            
            maxLen = Math.max(maxLen, currentLen);
        }

        System.out.println(maxLen);
    }
}