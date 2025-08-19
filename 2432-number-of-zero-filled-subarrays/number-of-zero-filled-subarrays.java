class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long c=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c++;
            }
            else
            {
                sum =sum+(long)(c*(c+1))/2;
                c=0;
            }
        }
         //If the array ends with zeros, the last segment’s subarrays are never added to the sum because the else branch (which adds subarray counts) does not get triggered after the last zero sequence.
        sum =sum+(long)(c*(c+1))/2;
        return sum;
        
    }
}