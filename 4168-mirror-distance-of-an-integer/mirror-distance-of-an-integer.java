class Solution {
    public int mirrorDistance(int n) {
        int rev = revm(n);
        return Math.abs(n-rev);
    }
    private int revm(int n){
         int prod=0;
        while(n>0){
            int temp = n%10;
            prod = (prod*10)+temp;
            n/=10;
        }
        return prod;
    }
}