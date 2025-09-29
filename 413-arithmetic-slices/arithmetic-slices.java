class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int totalCount = 0;
        int currentCount = 0;

        for (int i = 2; i < nums.length; i++) {
          
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                currentCount++;         
                totalCount += currentCount; 
            } else {
                currentCount = 0;        
            }
        }
        return totalCount;
    }
}
