class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
    String[] ws = text.split(" ");
    int k=0;
   
   Set<Character> bl = new HashSet<>();

   for(char c : brokenLetters.toCharArray())
   {
    bl.add(c);
   }

   for(String w : ws)
   {
    boolean typed = true;

    for(char c : w.toCharArray())
    {
        if(bl.contains(c))
        {
            typed = false;
            break;
        }
    }

    if(typed)
    {
        k++;
    }
   }
   return k;
        
    }
}