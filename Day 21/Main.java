// Codeforces 785A. Anton and Polyhedrons
// https://codeforces.com/problemset/problem/785/A 

import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;

        HashMap<String, Integer> map = new HashMap<>(); 
        map.put("Tetrahedron", 4);
        map.put("Cube" , 6);
        map.put("Octahedron", 8);
        map.put("Dodecahedron", 12);
        map.put("Icosahedron", 20);
        
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String polyhedrons = sc.next();
            result += map.get(polyhedrons);
        }

        System.out.println(result);
    }

}