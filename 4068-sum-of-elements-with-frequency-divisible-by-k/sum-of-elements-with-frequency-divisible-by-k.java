class Solution {
    public int sumDivisibleByK(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int sum=0;

        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            int val = e.getValue();
            if(val%k==0)
            {
                int i = e.getKey();
                while(val>0)
                {
                    sum = sum+i;
                    val--;
                }
            }
        }
        return sum;
        
    }
}