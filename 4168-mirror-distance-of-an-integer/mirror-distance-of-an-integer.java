class Solution {
    public int mirrorDistance(int n) {
        int original = n, prod=0;
        while(n>0){
            int temp = n%10;
            prod = (prod*10)+temp;
            n/=10;
        }
        System.out.print(n+"  "+prod);
        return Math.abs(original-prod);
    }
}