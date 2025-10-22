class Solution {
    public int missingMultiple(int[] nums, int k) {

  //Arrays.sort(nums);
        List<Integer> list  = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
           list.add(nums[i]);
        }
        
        int i=1;
        while(list.contains(k*i))
        {
            i++;
        }
        return k*i;

    }
}