import java.util.*;
class Solution {
    public int minSubArray(int[] nums) {
        int CurrentSum=nums[0];
        int MinSum=nums[0];

        for(int i=1;i<nums.length;i++){
            CurrentSum=Math.min(nums[i], CurrentSum+nums[i]);
            MinSum=Math.min(MinSum,CurrentSum);
        }
        return MinSum;
        
    }

public static void main(String[] args) {
        
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};


        Solution obj = new Solution();
        int result = obj.minSubArray(nums);
        System.out.println("Minimum Subarray Sum = " + result);
    }
}