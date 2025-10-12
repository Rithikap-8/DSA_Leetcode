class Solution {
    public int longestSubarray(int[] nums) {
        int max=2,curr=2;
       if(nums.length<3)
       {
        return nums.length;
       }

    for(int i=2;i<nums.length;i++)
    {
        if(nums[i]==nums[i-1]+nums[i-2])
        {
            curr++;
            max=Math.max(curr,max);
        }
        else
        {
            curr=2;
        }
    }
       return max;
    }
}