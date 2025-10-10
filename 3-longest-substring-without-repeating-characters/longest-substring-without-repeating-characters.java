class Solution {
    public int lengthOfLongestSubstring(String s) {

        List<Character> seen = new ArrayList<>();


        int start=0,end=0,maxlength = Math.min(s.length(),1);

        while(end < s.length())
        {
            char c= s.charAt(end);
            while(seen.contains(c))
            {
                seen.remove(Character.valueOf(s.charAt(start)));
                start+=1;
            }
            seen.add(c);
            int windowsize =  end-start+1;
            maxlength= Math.max(windowsize,maxlength);
            end+=1;
        }
        return maxlength;
        
    }
}