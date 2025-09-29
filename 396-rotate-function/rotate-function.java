class Solution {

    public int maxRotateFunction(int[] nums) {

        int sum=0,fun=0, n = nums.length;

        for(int i=0;i<nums.length;i++)
        {
          sum = sum+nums[i];
          fun=fun+(i*nums[i]);
        }

  int max=fun;
      for(int i=n-1;i>0;i--)
      {
          max=Math.max(max,fun+sum-(n*nums[i]));
          fun=fun+sum-(n*nums[i]);

      }
      return max;
        
    }
}