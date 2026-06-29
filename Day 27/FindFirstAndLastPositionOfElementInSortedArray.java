// LeetCode 34 - Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public static int firstOccurrence(int nums[], int n, int x){
        int low = 0;
        int high = n - 1;
        int first = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(nums[mid] == x){
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return first;
    }

    public static int lastOccurrence(int nums[], int n, int x){
        int low = 0;
        int high = n - 1;
        int last = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(nums[mid] == x){
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return last;
    }

    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums, nums.length, target);
        if(first == -1){
            return new int[] {-1, -1};
        }
        int last = lastOccurrence(nums, nums.length, target);
        
        return new int [] {first, last};
    }
}