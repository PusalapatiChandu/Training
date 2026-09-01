import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int CurrentSum=nums[0];
        int MaxSum=nums[0];

        for(int i=1;i<nums.length;i++){
            CurrentSum=Math.max(nums[i], CurrentSum+nums[i]);
            MaxSum=Math.max(MaxSum,CurrentSum);
        }
        return MaxSum;
        
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int result = obj.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum = " + result);
    }
}