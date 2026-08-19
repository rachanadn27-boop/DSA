class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int winSum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int end = 0; end < nums.length; end++) {
            winSum += nums[end];

            while (winSum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                winSum -= nums[start];
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}