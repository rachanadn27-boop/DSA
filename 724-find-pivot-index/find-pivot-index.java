
class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++) {
            left = 0;
            right = 0;

            for (int j = 0; j < i; j++) {
                left += nums[j];
            }

            for (int k = i + 1; k < nums.length; k++) {
                right += nums[k];
            }

            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
