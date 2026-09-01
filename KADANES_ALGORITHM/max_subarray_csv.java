
import java.io.*;
import java.util.*;

class Solution {

    public int maxSubArray(int[] nums) {
        int CurrentSum = nums[0];
        int MaxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            CurrentSum = Math.max(nums[i], CurrentSum + nums[i]);
            MaxSum = Math.max(MaxSum, CurrentSum);
        }

        return MaxSum;
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("input.csv"));

        String[] values = sc.nextLine().split(",");

        int[] nums = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            nums[i] = Integer.parseInt(values[i].trim());
        }

        Solution obj = new Solution();

        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);

    }
}