class Solution {
    public int gcdOfOddEvenSums(int n) {

      int sumOdd=0,sumEven =0;
        for(int i=1;i<=n;i++)
        {
           sumOdd += 2 * i - 1;  // ith odd number
            sumEven += 2 * i; 
        }

        return gcd(sumEven,sumOdd);     
    }

    public static int gcd(int e, int o)
    {
        if(o==0)
        {
            return e;
        }
        return gcd(o,e%o);
    }
}