class Solution {
    public int longestSubsequence(int[] nums) {

        int sum=0,xor=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            xor^=nums[i];
        }
        if(sum==0)return 0;
        if(xor>0)
        {
            return nums.length;
        }
        return nums.length-1;
        
    }
}