class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros=0;
        int st=0;
        int maxc=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==0){
                zeros++;
            }
            if(zeros>k){
                if(nums[st]==0){
                    nums[st]=1;
                    zeros--;
                }
                st++;
            }
            maxc=Math.max(maxc,end-st+1);
        }
        return maxc;
    }
}