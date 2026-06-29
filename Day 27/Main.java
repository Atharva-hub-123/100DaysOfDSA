// Codeforces 116A. Tram
// https://codeforces.com/problemset/problem/116/A

import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxCapacity = 0;
        int capacity = 0;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            capacity = capacity - a + b;
            maxCapacity = Math.max(capacity, maxCapacity);
        }

        System.out.println(maxCapacity);
    }
}