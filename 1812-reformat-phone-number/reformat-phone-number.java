class Solution {
    public String reformatNumber(String number) {
        number=number.replaceAll("[ -]", "");
        System.out.print(number);
        StringBuilder sb = new StringBuilder(number);
        int n=number.length(),count=0;
        if(n==4){
            sb.insert(2,"-");
            return sb.toString();
        }
        while(3<n){
            if(n==4){
                n-=2;
                count+=3;
                sb.insert(count,"-");
            }else{
                n-=3;
                count = (count == 0) ? (count + 3) : (count + 4);
                sb.insert(count,"-");
            }
           
        }
        return sb.toString();
    }
}