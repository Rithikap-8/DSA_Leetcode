class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder prefix = new StringBuilder(s.substring(0, k));
        prefix.reverse();
        return prefix.toString()+s.substring(k);
        
    }
}