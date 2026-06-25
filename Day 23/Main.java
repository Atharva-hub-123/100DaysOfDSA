// https://codeforces.com/problemset/problem/1030/A
// Codeforces 1030A - In Search of an Easy Problem

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hard = 0;

        for(int i = 0; i < n; i++){
            int problem = sc.nextInt();
            if(problem == 1){
                hard++;
            }
        }

        if(hard == 0){
            System.out.println("EASY");
        }
        else{
            System.out.println("HARD");
        }
    }
}