class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k)return s;
          ArrayList<String> list = new ArrayList<>();
          for (int i = 0; i < s.length(); i += k) {
            int end = Math.min(i + k, s.length());
            list.add(s.substring(i, end));
        }
        
        StringBuilder sb = new StringBuilder();
        for(String word : list)
        {
            int sum=0;
            for(char c : word.toCharArray())
            { sum = sum+c-'0';}
            sb.append(sum);
        }

        return digitSum(sb.toString(),k);
  
    }
}