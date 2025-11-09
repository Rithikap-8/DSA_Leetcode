import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int minimumDistance(int[] nums) {
        // Handle edge cases where a good tuple is impossible
        if (nums == null || nums.length < 3) {
            return -1;
        }
        
        List<Integer> list = new ArrayList<>();
        
        // Iterate through all possible distinct combinations of three indices (i, j, k)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    // Check if the elements at those indices are equal
                    if (nums[i] == nums[j] && nums[j] == nums[k]) {
                        // Calculate the exact distance as specified in the problem description
                        int dis = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                        list.add(dis);
                    }
                }
            }
        }
        
        // If no good tuples were found, the list will be empty.
        if (list.isEmpty()) {
            return -1;
        }

        // Sort the list of distances to find the minimum.
        // The list is sorted in ascending order by default.
        list.sort(null); 
        
        // Return the first (smallest) element of the sorted list.
        return list.get(0);
    }
}
