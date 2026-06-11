// LeetCode 2161 - Partition Array According to Given Pivot
// https://leetcode.com/problems/partition-array-according-to-given-pivot/description/

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int [] ans = new int[n];

        int index = 0;
        for(int num: nums){
            if(num < pivot){
                ans[index] = num;
                index++;
            }
        }

        for(int num: nums){
            if(num == pivot){
                ans[index] = num;
                index++;
            }
        }

        for(int num: nums){
            if(num > pivot){
                ans[index] = num;
                index++;
            }
        }

        return ans;
    }
}
