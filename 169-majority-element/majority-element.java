class Solution {
    public int majorityElement(int[] nums) {
        int element=0;
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
             count=1;
             element=nums[i];
            }
            else if(nums[i]==element)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                res++;
            }
        }
            return res>(nums.length/2) ? element : -1;
        
    }
}