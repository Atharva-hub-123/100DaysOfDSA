// LeetCode 1283 - Find the Smallest Divisor Given a Threshold
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold

class Solution {
    public static int maximumElement(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    public static int sumOfDivision(int arr[], int divisor){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += (arr[i] + divisor - 1) / divisor;
        }
        return sum;
    }
    
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = maximumElement(nums);
        int ans = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(sumOfDivision(nums, mid) <=  threshold){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}