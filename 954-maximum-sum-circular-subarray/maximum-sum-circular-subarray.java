class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int maxCur = nums[0];
        int maxSum = nums[0];

        int minCur = nums[0];
        int minSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            total += nums[i];

            if (i == 0)
                continue;

            maxCur = Math.max(nums[i], maxCur + nums[i]);
            maxSum = Math.max(maxSum, maxCur);

            minCur = Math.min(nums[i], minCur + nums[i]);
            minSum = Math.min(minSum, minCur);
        }

        // All elements are negative
        if (maxSum < 0)
            return maxSum;

        return Math.max(maxSum, total - minSum);
    }
}