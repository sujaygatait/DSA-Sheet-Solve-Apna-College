class Solution {
    public int maxSubArray(int[] nums) {
        boolean allNegative = true;
        int maxNegative = Integer.MIN_VALUE;

        int currentSum = 0;
        int maxSum = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0) allNegative = false;
            maxNegative = Math.max(maxNegative, nums[i]);

            currentSum += nums[i];
            if(currentSum < 0) currentSum = 0;
            maxSum = Math.max(maxSum, currentSum);
        }

        if(allNegative == true) {
            return maxNegative;
        }

        return maxSum;
    }
}
