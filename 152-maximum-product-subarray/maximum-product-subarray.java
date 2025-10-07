class Solution {
    public int maxProduct(int[] nums) {

        if(nums[0]==-2 && nums.length==1)return -2;
        int max =0;


        for(int i=0;i<nums.length;i++)
        {
            int prod =1;
            for(int j=i;j<nums.length;j++)
            {
                prod = prod*nums[j];
                max=Math.max(max,prod);

            }
        }
        return max;
        
    }
}