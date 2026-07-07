// LeetCode 1011 - Capacity To Ship Packages Within D Days
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days

class Solution {
    public static int maximumElement(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    public static int sumOfElements(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int daysRequired(int weights[], int capacity){
        int days = 1;
        int load = 0;
        for(int i = 0; i < weights.length; i++){
            if(load + weights[i] > capacity){
                days = days + 1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int low = maximumElement(weights);
        int high = sumOfElements(weights);
        int ans = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(daysRequired(weights, mid) <= days){
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

