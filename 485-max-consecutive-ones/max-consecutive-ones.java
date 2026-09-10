class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxc=Math.max(count,maxc);
            }
            else{
                count=0;
            }
        }
        return maxc;
    }
}