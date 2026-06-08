// LeetCode 118 - Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/description/

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> generateRows(int n){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col = 1; col < n; col++){
            ans = ans * (n - col);
            ans = ans / col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int row = 1; row <= numRows; row++){
            list.add(generateRows(row));
        }
        return list;
    }
}