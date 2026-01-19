class Solution {
    public int vowelConsonantScore(String s) {
        String vowels = "aeiou";
        int c=0,v=0;
        for(int i=0;i<s.length();i++){
            if(vowels.indexOf(s.charAt(i))!=-1){
                v++;
            }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                c++;
            }
        }
        return c>0 ? v/c : 0;
        
    }
}