class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int zeros=0;
        int max=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[start]==0){
                    nums[start]=1;
                    zeros--;
                    
                }
                start++;
                
            }
            max=Math.max(max,end-start+1);
        }
        return max;
    }
}