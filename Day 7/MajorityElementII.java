// LeetCode 229 - Majority Element II
// https://leetcode.com/problems/majority-element-ii/description/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int el1 = 0;
        int el2 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i < n; i++){
            if((cnt1 == 0 ) && (nums[i] != el2)){
                cnt1 = 1;
                el1 = nums[i];
            }

            else if((cnt2 == 0 ) && (nums[i] != el1)){
                cnt2 = 1;
                el2 = nums[i];
            }

            else if(nums[i] == el1){
                cnt1++;
            }

            else if(nums[i] == el2){
                cnt2++;
            }

            else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for(int num : nums){
            if(num == el1){
                cnt1++;
            }
            else if(num == el2){
                cnt2++;
            }
        }
        
        if(cnt1 > n/3){
            ans.add(el1);
        }

        if(cnt2 > n/3){
            ans.add(el2);
        }

        return ans;
    }
}