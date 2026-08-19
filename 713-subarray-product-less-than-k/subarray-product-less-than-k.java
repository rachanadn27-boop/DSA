class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int st=0;
        int pro=1;
        int count=0;
        if(k<=1){
            return 0;
        }
        for(int end=0;end<nums.length;end++){
            pro*=nums[end];
            while(pro>=k){
                pro/=nums[st];
                st++;
            }
            count+=end-st+1;
        }
        return count;
    }
}