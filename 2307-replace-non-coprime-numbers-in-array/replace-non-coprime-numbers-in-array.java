class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {

        List<Integer> st = new ArrayList<>();


        for(int num : nums)
        {
            int curr =num;

            while(!st.isEmpty())
            {
                int top = st.get(st.size()-1);
                int g = gcd(top,curr);
                {
                    if(g==1)
                    {
                        break;
                    }
                }
                st.remove(st.size()-1);
                curr = lcm(top,curr,g);
                System.out.print(curr);
            }
            st.add(curr);
        }
        return st;
        
    }

    private int gcd(int a, int b)
    {
        if(b==0) 
        {
            return a;
        }
        return gcd(b,a%b);
    }


    private int lcm(int a, int b ,int g)
    {
        return (int)((long)a/g*b );
    }
}