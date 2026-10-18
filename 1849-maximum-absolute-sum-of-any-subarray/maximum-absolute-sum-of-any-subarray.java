class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxcursum=nums[0];
        int maxsum=nums[0];
        int mincursum=nums[0];
        int minsum=nums[0];
        for(int i=1;i<nums.length;i++){
            maxcursum=Math.max(nums[i],maxcursum+nums[i]);
            maxsum=Math.max(maxsum,maxcursum);

        }
        for(int i=1;i<nums.length;i++){
            mincursum=Math.min(nums[i],mincursum+nums[i]);
            minsum=Math.min(minsum,mincursum);

        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}