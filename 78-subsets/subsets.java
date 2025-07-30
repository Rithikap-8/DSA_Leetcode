class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> s = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        subsequence(0, nums, s, ans);
        return ans;
    }

    public void subsequence(int index, int[] nums, List<Integer> s, List<List<Integer>> ans) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(s)); 
            return;
        }

        s.add(nums[index]);
        subsequence(index + 1, nums, s, ans);

        s.remove(s.size() - 1);
        subsequence(index + 1, nums, s, ans);
    }
}