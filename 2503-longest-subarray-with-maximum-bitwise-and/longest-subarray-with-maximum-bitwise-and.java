class Solution {
    public int longestSubarray(int[] nums) {


      int max=0;

       for(int i=0;i<nums.length;i++)
       {
            max = Math.max(max, nums[i]);
       }

       //return max;
       int count =0, smax=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==max)
        {
             count++;
             smax= Math.max(smax,count);
        }
        else{
            count=0;
        }
       }
       return smax;
        
    }
}