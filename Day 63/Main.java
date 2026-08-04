// Codeforces 2254B.Evanescent
// https://codeforces.com/contest/2254/problem/B

import java.util.*;

public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();

            int groups = 1;

            for(int i = 1; i < s.length(); i++){
                if(s.charAt(i) != s.charAt(i-1)){
                    groups++;
                }
            }

            int reduction = 0;

            for(int i = 1; i < s.length() - 1; i++){
                if (s.charAt(i - 1) == s.charAt(i + 1)&& s.charAt(i) != s.charAt(i - 1)) {
                    reduction = Math.max(reduction, 2);
                } 
                else if (s.charAt(i - 1) != s.charAt(i) && s.charAt(i) != s.charAt(i + 1)) {
                    reduction = Math.max(reduction, 1);
                }
            }

            System.out.println(groups - reduction);
        }
    }
}