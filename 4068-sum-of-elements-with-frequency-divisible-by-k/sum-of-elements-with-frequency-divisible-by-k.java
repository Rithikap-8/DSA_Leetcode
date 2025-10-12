class Solution {
    public int sumDivisibleByK(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int sum=0;

        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            int val = e.getValue();
             int i = e.getKey();
            if(val%k==0)
            {
                sum+= val*i;
            }
        }
        return sum;
        
    }
}