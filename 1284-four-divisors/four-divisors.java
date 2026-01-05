class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
       for(int val :nums){
        sum+=check(val);
       }
       return sum;
    }
    private static int check(int val){
        Set<Integer> res = new HashSet<>();
        int sum=0;
        for(int i=1;i*i<=val;i++){
            if(val%i==0){
                res.add(i);
                if(i*i!=val){
                    res.add(val/i);
                }
                sum=sum+(i+(val/i));
            }
        }
        return res.size()==4 ?sum :0;
    }
}