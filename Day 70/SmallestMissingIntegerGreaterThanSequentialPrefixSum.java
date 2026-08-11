// LeetCode 2996 - Smallest Missing Integer Greater Than Sequential Prefix Sum
// https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/description/

import java.util.*;

class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                sum += nums[i];
            }
            else{
                break;
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        while(set.contains(sum)){
            sum++;
        }

        return sum;
    }
}