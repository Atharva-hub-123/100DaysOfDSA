// Codeforces 1097A. Gennady and a Card Game
// https://codeforces.com/problemset/problem/1097/A 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cardOnTable = sc.next();
        boolean canPlayCard = false;

        for(int i = 0; i < 5; i++){
            String card = sc.next();

            if((cardOnTable.charAt(0) == card.charAt(0)) || (cardOnTable.charAt(1) == card.charAt(1))){
                canPlayCard = true;
            }
        }

        if(canPlayCard){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}