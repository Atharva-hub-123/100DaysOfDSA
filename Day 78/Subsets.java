// LeetCode 78 - Subsets
// https://leetcode.com/problems/subsets/description/

import java.util.*;

class Solution {
    private void func(int ind, int arr[], List<Integer> current, List<List<Integer>> ans){
        if(ind == arr.length){
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[ind]);
        func(ind + 1, arr, current, ans);

        current.remove(current.size() - 1);
        func(ind + 1, arr, current, ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        func(0, nums, current, ans);
        return ans;
    }
}
