// Codeforces 546A. Soldier and Bananas
// https://codeforces.com/problemset/problem/546/A

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int totalCost = 0;
        for(int i = 1; i <= w; i++){
            totalCost += (i*k);
        }

        int needToBorrow = totalCost - n;

        if(totalCost < n){
            System.out.println(0);
        }
        else{
            System.out.println(needToBorrow);
        }
    }
}