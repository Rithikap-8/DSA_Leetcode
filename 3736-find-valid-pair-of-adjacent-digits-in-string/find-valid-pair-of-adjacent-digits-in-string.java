class Solution {
    public String findValidPair(String s) {


       Map<Character,Integer> map = new HashMap<>();
       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
       }
    List<Character> res  = new ArrayList<>();
       for(Map.Entry<Character,Integer> e : map.entrySet()){
          char digit = e.getKey();
          int count = e.getValue();
          if(count==digit-'0'){
            res.add(digit);
          }
       }

       for(int i=0;i<s.length()-1;i++){
        char d1 =s.charAt(i);
        char d2 = s.charAt(i+1);
        if(d1==d2)continue;
        if(res.contains(d1) && res.contains(d2)){
                return "" + d1 + d2;
        }
       }
       return "";

          

        
    }
}