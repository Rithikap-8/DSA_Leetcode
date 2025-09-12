class Solution {
    public String sortVowels(String s) {

        StringBuilder sb = new StringBuilder();   
        StringBuilder sbv = new StringBuilder(); 

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if ("aeiouAEIOU".indexOf(currentChar) == -1) {
                
                sb.append(currentChar);
            } else {
                
                sb.append(' ');
                sbv.append(currentChar);
            }
        }

char[] vowelsArray = sbv.toString().toCharArray();
        Arrays.sort(vowelsArray);
        String sortedVowels = new String(vowelsArray);

        // System.out.print(sortedVowels);
        int vi=0;
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)== ' ')
            {
                sb.setCharAt(i , vowelsArray[vi]);
                vi++;
            }
        }


            return sb.toString();
    }
}
