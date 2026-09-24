class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int st=0;
        int zeros=0;
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
            max=Math.max(max,end-st+1);
        }
        return max;
    }
}