// Codeforces 2241C. RemovevomeR
// https://codeforces.com/contest/2241/problem/C


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int runs = 1;
            for (int j = 1; j < n; j++) {
                if (s.charAt(j) != s.charAt(j - 1)) {
                    runs++;
                }
            }
            
            if(runs == 2){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
        
        sc.close();
    }
}