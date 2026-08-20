// LeetCode 3069 - Distribute Elements Into Two Arrays I
// https://leetcode.com/problems/distribute-elements-into-two-arrays-i/description/

import java.util.*;

class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i = 2; i < n; i++){
            if(arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }

        int ans[] = new int[n];
        int ind = 0;

        for(int num: arr1){
            ans[ind++] = num;
        }

        for(int num: arr2){
            ans[ind++] = num;
        }

        return ans;
    }
}