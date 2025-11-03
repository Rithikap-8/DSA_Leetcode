class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum=0;

        for(int i=0;i<colors.length()-1;i++)
        {
           if(colors.charAt(i)==colors.charAt(i+1))
           {
             if(neededTime[i+1]>neededTime[i])
            {
              sum+=neededTime[i];
            }
            else
            {
                sum+=neededTime[i+1];
                //swap to take forward the greateer time , after we accounted the smaller one
                int temp  = neededTime[i+1];
                neededTime[i+1] = neededTime[i];
                neededTime[i] = temp;
            }
               
           }
        }
        return sum;
        
    }
}