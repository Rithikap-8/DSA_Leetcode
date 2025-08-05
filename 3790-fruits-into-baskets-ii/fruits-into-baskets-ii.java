class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int[] arr = new int[baskets.length];
        for(int i=0;i<fruits.length ;i++)
        {
            for(int j=0;j<baskets.length;j++)
            {
                if(baskets[j]>=fruits[i])
                {
                    arr[j]=fruits[i];
                    baskets[j]=0;
                    break;
                }
            }
        }
       int c=0;
        for(int i=0;i<baskets.length;i++)
        {
            if(baskets[i]!=0)
            {
                c++;
            }
        }
        return c;
    }
}